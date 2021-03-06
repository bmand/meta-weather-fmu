DESCRIPTION = "Boot files (bootscripts etc.) for BBBW"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"

inherit deploy

DEPENDS = "u-boot-mkimage-native"

S = "${WORKDIR}"

SRC_URI_append_sota = "file://uEnv.txt \
    file://boot.cmd \
    "

do_deploy() {
    install -d ${DEPLOYDIR}/${PN}

    mkimage -A arm -O linux -T script -C none -n "Ostree boot script" -d ${S}/boot.cmd ${DEPLOYDIR}/${PN}/boot.scr
    install -m 0755 ${WORKDIR}/uEnv.txt ${DEPLOYDIR}/${PN}/uEnv.txt
}

addtask deploy before do_package after do_install
do_deploy[dirs] += "${DEPLOYDIR}/${PN}"

PACKAGE_ARCH = "${MACHINE_ARCH}"

