# |<<

**请购单主表 (po_praybill / nc.vo.pu.m20.entity.PraybillHeaderVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4620.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_praybill | 请购单 | pk_praybill | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 库存组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | pk_org_v | 库存组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 5 | vbillcode | 请购单号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 6 | dbilldate | 请购日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 7 | bsctype | 委外 | bsctype | char(1) |  | 布尔类型 (UFBoolean) |
| 8 | fpraysource | 请购来源 | fpraysource | int |  | 请购来源 (请购来源) |  | 0=MRP计划订单; |