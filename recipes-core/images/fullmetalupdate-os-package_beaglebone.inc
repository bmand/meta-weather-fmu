# Copyright (C) 2019 Bertrand Mandrin
# Released under the MIT license (see COPYING.MIT for the terms)
WIC_CREATE_EXTRA_ARGS_append = "--no-fstab-update "

IMAGE_INSTALL_append = " \
    kernel-modules \
    python3-adafruit-bbio \
    python3-spidev \
    python3-pillow \
    "

IMAGE_INSTALL_append_sota = " uim iw wl18xx-calibrator wlconf wl18xx-fw hostapd wpa-supplicant"

IMAGE_FEATURES_REPLACES_ssh-server-openssh = "ssh-server-dropbear"

DISTRO_FEATURES_append = " wifi"
