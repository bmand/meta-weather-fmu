# Copyright (C) 2019 Bertrand Mandrin
# Released under the MIT license (see COPYING.MIT for the terms)

EXTRA_IMAGEDEPENDS_append_sota = " bbb-bootfiles"

IMAGE_BOOT_FILES_sota += "bbb-bootfiles/* \
    ${KERNEL_IMAGETYPE} \
    ${KERNEL_DEVICETREE} \
"

OSTREE_BOOTLOADER ?= "u-boot"

OSTREE_KERNEL_ARGS ?= "rw rootwait console=ttyO0,115200n8"

IMAGE_FSTYPES_remove_sota = "garagesign garagecheck"
