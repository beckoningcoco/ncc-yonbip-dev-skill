# |<<

**费用分配关系明细 (cm_alcrecord_b / nc.vo.cm.allocate.entity.record.AllocateRecordItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1439.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | calcrecord_bid | 分配事务明细 | calcrecord_bid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | char(20) |  | 主键 (UFID) |
| 3 | pk_book | 财务核算账簿 | pk_book | char(20) |  | 主键 (UFID) |
| 4 | pk_org | 工厂最新版本 | pk_org | char(20) |  | 主键 (UFID) |
| 5 | pk_org_v | 工厂 | pk_org_v | char(20) |  | 主键 (UFID) |
| 6 | nadjustnum | 调整数量 | nadjustnum | decimal(20, 8) |  | 数值 (UFDouble) |
| 7 | nadjustmoney | 调整金额 | nadjustmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | nallocnum | 调整后数量 | nallocnum | decimal(20, 8) |  | 数值 (UFDouble) |
| 9 | nallocmoney | 调整后金额 | nallocmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | itemcostcenter | 成本中心 | itemcostcenter | varchar(20) |  | 成本中心 (resacostcenter) |
| 11 | itemcostobjid | 成本对象 | itemcostobjid | varchar(20) |  | 成本对象 (cm_costobject) |
| 12 | itemelementsid | 成本要素 | itemelementsid | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 13 | itemactivityid | 作业 | itemactivityid | varchar(20) |  | 作业档案 (bd_activity) |
| 14 | itemmaterialid | 物料 | itemmaterialid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 15 | calcrecordid | 分配事务 | calcrecordid | char(20) |  | 主键 (UFID) |
| 16 | isourcetype | 分配类型 | isourcetype | int |  | 整数 (Integer) |
| 17 | csourcebill_bid | 分配信息明细 | csourcebill_bid | char(20) |  | 主键 (UFID) |
| 18 | csourcebillid | 分配信息 | csourcebillid | char(20) |  | 主键 (UFID) |
| 19 | ndrivernum | 动因量 | ndrivernum | decimal(20, 8) |  | 数值 (UFDouble) |
| 20 | vformulacode | 公式 | vformulacode | varchar(50) |  | 字符串 (String) |
| 21 | nmoney | 分配金额 | nmoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | nnum | 分配数量 | nnum | decimal(20, 8) |  | 数值 (UFDouble) |
| 23 | vnote | 备注 | vnote | varchar(181) |  | 字符串 (String) |
| 24 | itemmeasdocid | 主单位 | itemmeasdocid | varchar(20) |  | 计量单位 (measdoc) |
| 25 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 26 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 27 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 28 | ccustomerid | 客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 29 | csrccostdomainid | 来源成本域 | csrccostdomainid | varchar(20) |  | 组织_成本域 (costregion) |
| 30 | vbdef20 | vbdef20 | vbdef20 | varchar(101) |  | 自定义项 (Custom) |
| 31 | vbdef19 | vbdef19 | vbdef19 | varchar(101) |  | 自定义项 (Custom) |
| 32 | vbdef18 | vbdef18 | vbdef18 | varchar(101) |  | 自定义项 (Custom) |
| 33 | vbdef17 | vbdef17 | vbdef17 | varchar(101) |  | 自定义项 (Custom) |
| 34 | vbdef16 | vbdef16 | vbdef16 | varchar(101) |  | 自定义项 (Custom) |
| 35 | vbdef15 | vbdef15 | vbdef15 | varchar(101) |  | 自定义项 (Custom) |
| 36 | vbdef14 | vbdef14 | vbdef14 | varchar(101) |  | 自定义项 (Custom) |
| 37 | vbdef13 | vbdef13 | vbdef13 | varchar(101) |  | 自定义项 (Custom) |
| 38 | vbdef12 | vbdef12 | vbdef12 | varchar(101) |  | 自定义项 (Custom) |
| 39 | vbdef11 | vbdef11 | vbdef11 | varchar(101) |  | 自定义项 (Custom) |
| 40 | vbdef10 | vbdef10 | vbdef10 | varchar(101) |  | 自定义项 (Custom) |
| 41 | vbdef9 | vbdef9 | vbdef9 | varchar(101) |  | 自定义项 (Custom) |
| 42 | vbdef8 | vbdef8 | vbdef8 | varchar(101) |  | 自定义项 (Custom) |
| 43 | vbdef7 | vbdef7 | vbdef7 | varchar(101) |  | 自定义项 (Custom) |
| 44 | vbdef6 | vbdef6 | vbdef6 | varchar(101) |  | 自定义项 (Custom) |
| 45 | vbdef5 | vbdef5 | vbdef5 | varchar(101) |  | 自定义项 (Custom) |
| 46 | vbdef4 | vbdef4 | vbdef4 | varchar(101) |  | 自定义项 (Custom) |
| 47 | vbdef3 | vbdef3 | vbdef3 | varchar(101) |  | 自定义项 (Custom) |
| 48 | vbdef1 | vbdef1 | vbdef1 | varchar(101) |  | 自定义项 (Custom) |
| 49 | vbdef2 | vbdef2 | vbdef2 | varchar(101) |  | 自定义项 (Custom) |
| 50 | vbfree1 | 自由辅助属性1 | vbfree1 | varchar(101) |  | 自由项 (Custom) |
| 51 | vbfree2 | 自由辅助属性2 | vbfree2 | varchar(101) |  | 自由项 (Custom) |
| 52 | vbfree3 | 自由辅助属性3 | vbfree3 | varchar(101) |  | 自由项 (Custom) |
| 53 | vbfree4 | 自由辅助属性4 | vbfree4 | varchar(101) |  | 自由项 (Custom) |
| 54 | vbfree5 | 自由辅助属性5 | vbfree5 | varchar(101) |  | 自由项 (Custom) |
| 55 | vbfree6 | 自由辅助属性6 | vbfree6 | varchar(101) |  | 自由项 (Custom) |
| 56 | vbfree7 | 自由辅助属性7 | vbfree7 | varchar(101) |  | 自由项 (Custom) |
| 57 | vbfree8 | 自由辅助属性8 | vbfree8 | varchar(101) |  | 自由项 (Custom) |
| 58 | vbfree9 | 自由辅助属性9 | vbfree9 | varchar(101) |  | 自由项 (Custom) |
| 59 | vbfree10 | 自由辅助属性10 | vbfree10 | varchar(101) |  | 自由项 (Custom) |