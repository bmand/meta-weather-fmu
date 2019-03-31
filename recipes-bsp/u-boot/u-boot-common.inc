# Copyright (C) 2019 Bertrand Mandrin
# Released under the MIT license (see COPYING.MIT for the terms)

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI_append = " file://update_common.h "

SRC_URI_append_beaglebone = " file://0001-Kconfig-Enlarge-default-SYS_MALLOC_F_LEN-for-AM33XX.patch "

S="${WORKDIR}/git"

do_copy_update_config(){
	cp ${WORKDIR}/update_common.h  ${S}/include/configs/update_common.h
}

addtask copy_update_config after do_configure before do_compile
