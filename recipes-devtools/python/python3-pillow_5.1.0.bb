SUMMARY = "Python Imaging Library (Fork)"
DESCRIPTION = "Pillow is the friendly PIL fork by Alex Clark and Contributors. PIL is the Python Imaging Library by Fredrik Lundh and Contributors."
HOMEPAGE = "https://python-pillow.org/"
SECTION = "devel/python"
LICENSE = "PIL"
LIC_FILES_CHKSUM = "file://LICENSE;md5=c6379001ecb47e2a0420c40177fc1125"
SRCNAME = "Pillow"
BPN = "Pillow"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI[md5sum] = "308f9c13b376abce96ab6ebd6c889cc4"
SRC_URI[sha256sum] = "cee9bc75bff455d317b6947081df0824a8f118de2786dc3d74a3503fd631f4ef"

SRC_URI += " \
    file://0001-build-always-disable-platform-guessing.patch \
"

DEPENDS += "zlib libpng jpeg"

CFLAGS_append = " -I${STAGING_INCDIR}"
LDFLAGS_append = " -L${STAGING_LIBDIR}"

do_compile_prepend() {
    export LDFLAGS="$LDFLAGS -L${STAGING_LIBDIR}"
    export CFLAGS="$CFLAGS -I${STAGING_INCDIR}"
}

CLEANBROKEN="1"

inherit pypi setuptools3

