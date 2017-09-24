require linux-firmware.inc

DESCRIPTION = "Firmware for xc5000c"

SRCREV = "6dda26f406b6eb85c5a364a85a83a73f217395ad"

do_install() {
	install -d ${D}${base_libdir}/firmware
	install -m 0644 dvb-fe-xc5000c-4.1.30.7.fw ${D}${base_libdir}/firmware
}
