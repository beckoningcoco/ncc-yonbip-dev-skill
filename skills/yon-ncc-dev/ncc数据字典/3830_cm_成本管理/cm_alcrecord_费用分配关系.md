# |<<

**费用分配关系 (cm_alcrecord / nc.vo.cm.allocate.entity.record.AllocateRecordHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1438.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | calcrecordid | 主键 | calcrecordid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_book | 财务核算账簿 | pk_book | char(20) |  | 主键 (UFID) |
| 4 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 5 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 6 | nalloctnum | 待分配数量 | nalloctnum | decimal(20, 8) |  | 数值 (UFDouble) |
| 7 | nalloctmoney | 待分配金额 | nalloctmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | callocdefid | 分配事务定义 | callocdefid | varchar(20) |  | 分配事务定义 (cm_allocdef) |
| 9 | cperiod | 会计期间 | cperiod | varchar(20) |  | 会计月份 (accperiodmonth) |
| 10 | ccostcenterid | 成本中心 | ccostcenterid | varchar(20) |  | 成本中心 (resacostcenter) |
| 11 | ccostobjectid | 成本对象 | ccostobjectid | varchar(20) |  | 成本对象 (cm_costobject) |
| 12 | celementid | 核算要素 | celementid | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 13 | cactivityid | 作业 | cactivityid | varchar(20) |  | 作业档案 (bd_activity) |
| 14 | cmaterialid | 物料 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 15 | vnote | 备注 | vnote | varchar(181) |  | 字符串 (String) |
| 16 | cmeasdocid | 单位 | cmeasdocid | varchar(50) |  | 字符串 (String) |
| 17 | ccustomerid | 客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 18 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 19 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 20 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 21 | csrccostdomainid | 来源成本域 | csrccostdomainid | varchar(20) |  | 组织_成本域 (costregion) |
| 22 | vdef1 | vdef1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 23 | vdef2 | vdef2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 24 | vdef3 | vdef3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 25 | vdef4 | vdef4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 26 | vdef5 | vdef5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 27 | vdef6 | vdef6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 28 | vdef7 | vdef7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 29 | vdef8 | vdef8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 30 | vdef9 | vdef9 | vdef9 | varchar(101) |  | 自定义项 (Custom) |
| 31 | vdef20 | vdef20 | vdef20 | varchar(101) |  | 自定义项 (Custom) |
| 32 | vdef19 | vdef19 | vdef19 | varchar(101) |  | 自定义项 (Custom) |
| 33 | vdef18 | vdef18 | vdef18 | varchar(101) |  | 自定义项 (Custom) |
| 34 | vdef17 | vdef17 | vdef17 | varchar(101) |  | 自定义项 (Custom) |
| 35 | vdef16 | vdef16 | vdef16 | varchar(101) |  | 自定义项 (Custom) |
| 36 | vdef15 | vdef15 | vdef15 | varchar(101) |  | 自定义项 (Custom) |
| 37 | vdef14 | vdef14 | vdef14 | varchar(101) |  | 自定义项 (Custom) |
| 38 | vdef13 | vdef13 | vdef13 | varchar(101) |  | 自定义项 (Custom) |
| 39 | vdef12 | vdef12 | vdef12 | varchar(101) |  | 自定义项 (Custom) |
| 40 | vdef10 | vdef10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |
| 41 | vdef11 | vdef11 | vdef11 | varchar(101) |  | 自定义项 (Custom) |
| 42 | vbfree1 | 自由辅助属性1 | vbfree1 | varchar(101) |  | 自由项 (Custom) |
| 43 | vbfree2 | 自由辅助属性2 | vbfree2 | varchar(101) |  | 自由项 (Custom) |
| 44 | vbfree3 | 自由辅助属性3 | vbfree3 | varchar(101) |  | 自由项 (Custom) |
| 45 | vbfree4 | 自由辅助属性4 | vbfree4 | varchar(101) |  | 自由项 (Custom) |
| 46 | vbfree5 | 自由辅助属性5 | vbfree5 | varchar(101) |  | 自由项 (Custom) |
| 47 | vbfree6 | 自由辅助属性6 | vbfree6 | varchar(101) |  | 自由项 (Custom) |
| 48 | vbfree7 | 自由辅助属性7 | vbfree7 | varchar(101) |  | 自由项 (Custom) |
| 49 | vbfree8 | 自由辅助属性8 | vbfree8 | varchar(101) |  | 自由项 (Custom) |
| 50 | vbfree9 | 自由辅助属性9 | vbfree9 | varchar(101) |  | 自由项 (Custom) |
| 51 | vbfree10 | 自由辅助属性10 | vbfree10 | varchar(101) |  | 自由项 (Custom) |
| 52 | creator | 创建人 | creator | char(20) |  | 主键 (UFID) |
| 53 | creationtime | 创建时间 | creationtime | char(19) |  | 日期 (UFDate) |