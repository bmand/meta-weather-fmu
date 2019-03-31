# Copyright (C) 2019 Witekio
# Released under the MIT license (see COPYING.MIT for the terms)
PREINSTALLED_CONTAINERS_LIST_append = "container-hello-world"

IMAGE_ROOTFS_EXTRA_SPACE = "202173"

KERNELDEPMODDEPEND = ""

python () {
    flag = d.getVarFlag('do_build', 'depends')
    flag = flag.replace('virtual/kernel:do_deploy', '')
    d.setVarFlag('do_build', 'depends', flag)
}
