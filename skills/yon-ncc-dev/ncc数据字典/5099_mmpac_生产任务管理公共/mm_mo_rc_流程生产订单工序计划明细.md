# |<<

**流程生产订单工序计划明细 (mm_mo_rc / nc.vo.mmpac.pmo.pac0002.entity.PMOItemVO_RC)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3693.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | crcprocedureid | 工序计划明细 | crcprocedureid | varchar(50) | √ | 字符串 (String) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | vrcrowno | 工序计划行号 | vrcrowno | varchar(30) |  | 字符串 (String) |
| 6 | crcrtbid | 工艺路线明细 | crcrtbid | varchar(20) |  | 字符串 (String) |
| 7 | vrcrccode | 工序号 | vrcrccode | varchar(30) |  | 字符串 (String) |
| 8 | vrcrcname | 工序说明 | vrcrcname | varchar(200) |  | 字符串 (String) |
| 9 | brcmain | 主序 | brcmain | char(1) |  | 布尔类型 (UFBoolean) |
| 10 | crcrctypeid | 工序编码 | crcrctypeid | varchar(20) |  | 标准工序 (pd_rc) |
| 11 | crcwkid | 工作中心 | crcwkid | varchar(20) |  | 工作中心 (bd_wk) |
| 12 | nrcplanmmastnum | 计划生产数量 | nrcplanmmastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | nrcplanmmnum | 计划生产主数量 | nrcplanmmnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | vrclaptype | 重叠类型 | vrclaptype | int |  | 重叠类型 (FnoverloptypeEnum) |  | 1=时间重叠; |