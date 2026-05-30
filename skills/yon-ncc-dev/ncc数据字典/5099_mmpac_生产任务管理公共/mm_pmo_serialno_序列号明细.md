# |<<

**序列号明细 (mm_pmo_serialno / nc.vo.mmpac.pmo.pac0002.entity.PMOSerialNoVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3740.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_mo_serialno | 订单序列号 | pk_mo_serialno | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂新版 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | cserialnoid | 序列号明细 | cserialnoid | varchar(20) |  | 字符串 (String) |
| 6 | vsncode | 序列号 | vsncode | varchar(128) |  | 字符串 (String) |
| 7 | breport | 已报工 | breport | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | csnunitid | 主单位 | csnunitid | varchar(20) |  | 计量单位 (measdoc) |
| 9 | nsnnum | 主数量 | nsnnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | csnastunitid | 单位 | csnastunitid | varchar(20) |  | 计量单位 (measdoc) |
| 11 | nsnastnum | 数量 | nsnastnum | decimal(28, 8) |  | 数值 (UFDouble) |