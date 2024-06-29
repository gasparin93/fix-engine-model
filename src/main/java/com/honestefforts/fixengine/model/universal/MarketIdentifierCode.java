package com.honestefforts.fixengine.model.universal;

import lombok.AllArgsConstructor;
import lombok.Getter;

//TODO: abstract this into a table within a data provider service - iso-data-provider for all iso-derived values?
//TODO: this should not be an enum, it should be a class or record, MarketIdentification, with all fields from CSV
//TODO: have an additional service running on cron that upkeeps ISO values for data provider
//TODO: once data provider is in, replace instances of this with record
//most values removed for simplicity until data service is created, only first few supported
@Getter
@AllArgsConstructor
public enum MarketIdentifierCode {

  DRSP("DRSP","DRSP"),

  XCNQ("XCNQ","XCNQ"),

  PURE("PURE","XCNQ"),

  ZODM("ZODM","ZODM"),

  FNFX("FNFX","BGCF"),

  NORX("NORX","NORX"),

  POSE("POSE","POSE"),

  PUND("PUND","PUND"),

  UCBG("UCBG","UCBG"),

  NZFX("NZFX","XASX"),

  XOCH("XOCH","XOCH"),

  BBLX("BBLX","BBLX"),

  BACR("BACR","BAIP"),

  SPBE("SPBE","SPBE"),

  OTCM("OTCM","OTCM"),

  STUF("STUF","XSTU"),

  XSTP("XSTP","XSTU"),

  STUE("STUE","XSTU"),

  FREX("FREX","FREX"),

  HCER("HCER","HMTF"),

  IDXM("IDXM","IDXM"),

  MBCP("MBCP","MBCP"),

  GMBG("GMBG","MBUL"),

  OCEA("OCEA","OCEA"),

  OSDS("OSDS","OSDS"),

  OSSG("OSSG","OSSG"),

  RR4G("RR4G","RR4G"),

  TRUK("TRUK","TRUK"),

  UGEN("UGEN","UGEN"),

  XGLO("XGLO","XWAR"),

  WIND("WIND","XWAR"),

  CNOD("CNOD","CNOD"),

  BGLU("BGLU","BGLU"),

  FNIX("FNIX","GFAM"),

  LATG("LATG","GFAM"),

  GFAM("GFAM","GFAM"),

  TMCY("TMCY","TMCY"),

  UBEC("UBEC","UBEC"),

  ENSL("ENSL","ESLO"),

  ESLO("ESLO","ESLO"),

  IOTF("IOTF","IOTF"),

  SEBA("SEBA","SEBA"),

  UBIM("UBIM","UBIM"),

  XUBS("XUBS","XUBS"),

  XUMP("XUMP","XUBS"),

  AMLG("AMLG","AMLG"),

  BRED("BRED","BRED"),

  DBMO("DBMO","DBAG"),

  DBLN("DBLN","DBAG"),

  DBIX("DBIX","DBIX"),

  RUSX("RUSX","RUSX"),

  UNGB("UNGB","UNGB"),

  XLQC("XLQC","XLQC"),

  XMOS("XMOS","XMOS"),

  ABXX("ABXX","VMEX"),

  CFIC("CFIC","CFIC"),

  HBFR("HBFR","HBFR"),

  KLSH("KLSH","KLSH"),

  MUDX("MUDX","MUDX"),

  TRAX("TRAX","TRAX"),

  TRNL("TRNL","TRNL"),

  XPET("XPET","XPET"),

  LEVL("LEVL","LEVL");

  private final String mic;
  private final String operatingMic;
}
