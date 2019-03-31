# Copyright (C) 2019 Bertrand Mandrin
# Released under the MIT license (see COPYING.MIT for the terms)
SRC_URI_append = " \
    file://wireless.network \
"

FILES_${PN} += " \
    ${nonarch_base_libdir}/systemd/network \
"

PACKAGECONFIG_append = " networkd"

do_install_append() {
    # The network files need to be in /usr/lib/systemd, not ${systemd_unitdir}...
    install -d ${D}${prefix}/lib/systemd/network/
    install -d ${D}/etc/systemd/network/
    install -m 0644 ${WORKDIR}/wireless.network ${D}/etc/systemd/network/

    rm ${D}${sysconfdir}/systemd/system/getty.target.wants/getty@tty1.service
}
