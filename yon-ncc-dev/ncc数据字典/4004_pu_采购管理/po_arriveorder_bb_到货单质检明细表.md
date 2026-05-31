# |<<

**到货单质检明细表 (po_arriveorder_bb / nc.vo.pu.m23.entity.ArriveBbVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4588.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_arriveorder_bb | 到货单质检明细 | pk_arriveorder_bb | char(20) | √ | 主键 (UFID) |
| 2 | pk_arriveorder | 到货单主键 | pk_arriveorder | char(20) |  | 主键 (UFID) |
| 3 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | bcanstore | 是否可入库 | bcanstore | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | nnum | 主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | nastnum | 数量 | nastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | pk_inbatchcode | 入库批次号主键 | pk_inbatchcode | varchar(20) |  | 主键 (UFID) |
| 8 | vinbatchcode | 入库批次号编码 | vinbatchcode | varchar(40) |  | 字符串 (String) |
| 9 | naccumstorenum | 累计入库数量 | naccumstorenum | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | beligible | 是否合格 | beligible | char(1) |  | 布尔类型 (UFBoolean) |
| 11 | bchanged | 是否改判 | bchanged | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | pk_chgmaterial | 改判物料版本 | pk_chgmaterial | varchar(20) |  | 物料基本信息（多版本） (material) |
| 13 | pk_chgsrcmaterial | 改判物料 | pk_chgsrcmaterial | varchar(20) |  | 物料基本信息 (material_v) |
| 14 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 15 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 16 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 17 | vchgfree1 | 改判自由辅助属性1 | vchgfree1 | varchar(100) |  | 字符串 (String) |
| 18 | vchgfree2 | 改判自由辅助属性2 | vchgfree2 | varchar(100) |  | 字符串 (String) |
| 19 | vchgfree3 | 改判自由辅助属性3 | vchgfree3 | varchar(100) |  | 字符串 (String) |
| 20 | vchgfree4 | 改判自由辅助属性4 | vchgfree4 | varchar(100) |  | 字符串 (String) |
| 21 | vchgfree5 | 改判自由辅助属性5 | vchgfree5 | varchar(100) |  | 字符串 (String) |
| 22 | vchgfree6 | 改判自由辅助属性6 | vchgfree6 | varchar(100) |  | 字符串 (String) |
| 23 | vchgfree7 | 改判自由辅助属性7 | vchgfree7 | varchar(100) |  | 字符串 (String) |
| 24 | vchgfree8 | 改判自由辅助属性8 | vchgfree8 | varchar(100) |  | 字符串 (String) |
| 25 | vchgfree9 | 改判自由辅助属性9 | vchgfree9 | varchar(100) |  | 字符串 (String) |
| 26 | vchgfree10 | 改判自由辅助属性10 | vchgfree10 | varchar(100) |  | 字符串 (String) |
| 27 | pk_qcreport | 质检报告主键 | pk_qcreport | char(20) |  | 主键 (UFID) |