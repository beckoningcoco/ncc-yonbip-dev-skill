# |<<

**成本还原比率 (cm_ctrevertratio / nc.vo.cm.costrevert.revertradio.CtRevertRatioHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1464.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cctrevertratioid | 成本还原比率 | cctrevertratioid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | cperiod | 会计期间 | cperiod | varchar(20) |  | 会计月份 (accperiodmonth) |
| 6 | cmaterialid | 产品最新版本 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 7 | cmarcostclassid | 物料成本分类 | cmarcostclassid | varchar(20) |  | 物料成本分类 (marcostclass) |
| 8 | cmeasureid | 计量单位 | cmeasureid | varchar(20) |  | 计量单位 (measdoc) |
| 9 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 10 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 11 | ccustomerid | 客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 12 | dbusinessdate | 业务日期 | dbusinessdate | char(19) |  | 日期 (UFDate) |
| 13 | vnote | 备注 | vnote | varchar(181) |  | 字符串 (String) |
| 14 | isourcetype | 来源类型 | isourcetype | int |  | 综合还原来源类型 (enum) | 1 | 1=自制; |