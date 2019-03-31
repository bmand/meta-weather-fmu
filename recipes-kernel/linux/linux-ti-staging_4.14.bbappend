FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append = " \
    file://0001-Add-SPI1-support.patch \
    file://cape-weather-0010.dtso \
"

#KERNEL_DEVICETREE += " cape-weather-0010.dtbo "

#do_setup_wo() {
#    cp ${WORKDIR}/cape-weather-0010.dtso ${S}/arch/arm/boot/dts/
#}

#do_patch[postfuncs] += "do_setup_wo"
