# |<<

**成本还原比率明细 (cm_ctrevertratio_b / nc.vo.cm.costrevert.revertradio.CtRevertRatioItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1465.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cctrevertratiobid | 成本还原比率明细 | cctrevertratiobid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | cctrevertratioid | 成本还原比率 | cctrevertratioid | char(20) |  | 主键 (UFID) |
| 6 | celementid | 核算要素 | celementid | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 7 | cmaterialid | 物料最新版本 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 8 | nunitconsume | 单耗 | nunitconsume | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | nunitcost | 单位成本 | nunitcost | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | cmeasureid | 计量单位 | cmeasureid | varchar(20) |  | 计量单位 (measdoc) |
| 11 | cbproductorid | 生产厂商 | cbproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 12 | cbvendorid | 供应商 | cbvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 13 | cbcustomerid | 客户 | cbcustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 14 | cbprojectid | 项目 | cbprojectid | varchar(20) |  | 项目 (project) |
| 15 | vbfree1 | 自由辅助属性1 | vbfree1 | varchar(101) |  | 自由项 (Custom) |
| 16 | vbfree2 | 自由辅助属性2 | vbfree2 | varchar(101) |  | 自由项 (Custom) |
| 17 | vbfree3 | 自由辅助属性3 | vbfree3 | varchar(101) |  | 自由项 (Custom) |
| 18 | vbfree4 | 自由辅助属性4 | vbfree4 | varchar(101) |  | 自由项 (Custom) |
| 19 | vbfree5 | 自由辅助属性5 | vbfree5 | varchar(101) |  | 自由项 (Custom) |
| 20 | vbfree6 | 自由辅助属性6 | vbfree6 | varchar(101) |  | 自由项 (Custom) |
| 21 | vbfree7 | 自由辅助属性7 | vbfree7 | varchar(101) |  | 自由项 (Custom) |
| 22 | vbfree8 | 自由辅助属性8 | vbfree8 | varchar(101) |  | 自由项 (Custom) |
| 23 | vbfree9 | 自由辅助属性9 | vbfree9 | varchar(101) |  | 自由项 (Custom) |
| 24 | vbfree10 | 自由辅助属性10 | vbfree10 | varchar(101) |  | 自由项 (Custom) |
| 25 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 26 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |