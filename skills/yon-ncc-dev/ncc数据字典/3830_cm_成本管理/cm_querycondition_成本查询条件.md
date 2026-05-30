# |<<

**成本查询条件 (cm_querycondition / nc.vo.cm.report.QueryConditionVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1500.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cqueryconditionid | 成本查询条件 | cqueryconditionid | char(20) | √ | 主键 (UFID) |
| 2 | ccostcenterid | 成本中心 | ccostcenterid | varchar(20) |  | 成本中心 (resacostcenter) |
| 3 | ccostcentergroup | 成本中心组 | ccostcentergroup | varchar(20) |  | 成本中心组 (costcentergroup) |
| 4 | pk_org | 工厂 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 5 | cperiod | 会计期间 | cperiod | varchar(20) |  | 会计期间档案 (accperiod) |
| 6 | cfinishcostcenter | 完工成本中心 | cfinishcostcenter | varchar(20) |  | 成本中心 (resacostcenter) |
| 7 | cactivity | 作业 | cactivity | varchar(20) |  | 作业档案 (bd_activity) |
| 8 | cconsumcostcenter | 消耗成本中心 | cconsumcostcenter | varchar(20) |  | 成本中心 (resacostcenter) |
| 9 | ccostobjectid | 成本对象 | ccostobjectid | varchar(20) |  | 成本对象 (cm_costobject) |
| 10 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 11 | pk_marbasclass | 产品基本分类 | pk_marbasclass | varchar(20) |  | 物料基本分类 (marbasclass) |
| 12 | cmarcostclassid | 产品成本分类 | cmarcostclassid | varchar(20) |  | 物料成本分类 (marcostclass) |
| 13 | cmaterialid | 产品 | cmaterialid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 14 | materialspec | 规格 | materialspec | varchar(50) |  | 字符串 (String) |
| 15 | materialtype | 型号 | materialtype | varchar(50) |  | 字符串 (String) |
| 16 | ishowmeasdoc | 显示单位 | ishowmeasdoc | varchar(50) |  | 字符串 (String) |
| 17 | vmocode | 生产订单 | vmocode | varchar(50) |  | 字符串 (String) |
| 18 | vmobatchcode | 生产批次 | vmobatchcode | varchar(50) |  | 字符串 (String) |
| 19 | ccosttypeid | 成本类型 | ccosttypeid | varchar(20) |  | 成本类型 (mapub_costtype) |
| 20 | nactnum | 作业量 | nactnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | nactcost | 作业成本 | nactcost | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | celementgroupid | 核算要素组 | celementgroupid | varchar(20) |  | 核算要素组 (factorgroup) |
| 23 | celementid | 核算要素 | celementid | varchar(20) |  | 核算要素 (Factor) |
| 24 | bsubtype | 是否本下阶 | bsubtype | char(1) |  | 布尔类型 (UFBoolean) |
| 25 | bfromcostcenter | 是否来源于其他成本中心 | bfromcostcenter | char(1) |  | 布尔类型 (UFBoolean) |
| 26 | ireportsource | 报表来源 | ireportsource | int |  | 整数 (Integer) |
| 27 | ireportcontent | 报表内容 | ireportcontent | int |  | 整数 (Integer) |
| 28 | baloneshowactivity | 作业成本单列 | baloneshowactivity | char(1) |  | 布尔类型 (UFBoolean) |
| 29 | ishowtype | 显示方式 | ishowtype | int |  | 整数 (Integer) |
| 30 | iclasslevel | 分类级次 | iclasslevel | int |  | 整数 (Integer) |
| 31 | ielementlevel | 核算要素级次 | ielementlevel | int |  | 整数 (Integer) |
| 32 | bshowstdcost | 显示标准成本 | bshowstdcost | char(1) |  | 布尔类型 (UFBoolean) |
| 33 | ianalysemethod | 分析方法 | ianalysemethod | int |  | 整数 (Integer) |
| 34 | canalyseperiod | 分析期间 | canalyseperiod | varchar(20) |  | 会计期间档案 (accperiod) |
| 35 | caccountyear | 会计年度 | caccountyear | varchar(50) |  | 字符串 (String) |
| 36 | icomparebase | 对比基数 | icomparebase | int |  | 整数 (Integer) |
| 37 | chistoryperiod | 历史期间 | chistoryperiod | varchar(20) |  | 会计期间档案 (accperiod) |
| 38 | ianalyseobject | 分析对象 | ianalyseobject | int |  | 整数 (Integer) |
| 39 | bshoweclementdetail | 展开要素明细 | bshoweclementdetail | char(1) |  | 布尔类型 (UFBoolean) |
| 40 | cstuffid | 材料 | cstuffid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 41 | cforecastperiod | 预测期间 | cforecastperiod | varchar(20) |  | 会计期间档案 (accperiod) |
| 42 | iqueryobject | 查询对象 | iqueryobject | int |  | 整数 (Integer) |