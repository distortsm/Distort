package net.distortsm.api.element;

public enum BlockType {
    DECORATION,
    SYSTEM,
    LOGIC {
        public Boolean activatedByRail = false;
        public Boolean button = false;

        public void setActivatedByRail(Boolean bool) {
            this.activatedByRail = bool;
        }

        public Boolean isActivatedByRail() {
            return this.activatedByRail;
        }

        public void setButton(Boolean bool) {
            this.button = bool;
        }

        public Boolean isButton() {
            return this.button;
        }
    }


}
