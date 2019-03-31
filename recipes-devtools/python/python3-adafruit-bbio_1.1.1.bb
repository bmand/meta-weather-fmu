SUMMARY = "Adafruit Beaglebone I/O Python API"
DESCRIPTION = ""
HOMEPAGE = "https://github.com/adafruit/adafruit-beaglebone-io-python/"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://${COREBASE}/meta/COPYING.MIT;md5=3da9cfbcb788c80a0384361b4de20420"
SRCNAME = "Adafruit_BBIO"
BPN = "Adafruit_BBIO"

SRC_URI[md5sum] = "75c676577216244b74958d02900480b5"
SRC_URI[sha256sum] = "9e8255aefb3470706ca2bb63432e4ceb697de2ab1b0be69904456840da0dafd8"

FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"
SRC_URI_append = " \
    file://0001-BBBW-don-t-use-overlay.patch \
    "

inherit pypi setuptools3

