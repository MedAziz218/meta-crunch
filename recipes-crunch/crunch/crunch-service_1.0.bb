LICENSE = "CLOSED"
inherit systemd

SYSTEMD_AUTO_ENABLE = "enable"
SYSTEMD_SERVICE:${PN} = "crunch.service"

SRC_URI:append = " file://crunch.service "
FILES:${PN} += "${systemd_unitdir}/system/crunch.service"

DEPENDS +=  "crunch"
RDEPENDS:${PN} += "crunch"

do_install:append() {
  install -d ${D}/${systemd_unitdir}/system
  install -m 0644 ${WORKDIR}/crunch.service ${D}/${systemd_unitdir}/system
}


