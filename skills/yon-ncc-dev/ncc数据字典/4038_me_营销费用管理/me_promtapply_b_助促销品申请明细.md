# |<<

**助促销品申请明细 (me_promtapply_b / nc.vo.me.m4642.entity.BillItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3618.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbill_bid | 助促销品申请明细 | cbill_bid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 销售组织 | pk_org | varchar(20) |  | 组织_业务单元_销售组织 (salesorg) |
| 4 | dbilldate | 单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 5 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 6 | cassumeorgid | 费用承担单位 | cassumeorgid | varchar(20) |  | 组织 (org) |
| 7 | cassumeorgvid | 费用承担单位版本信息 | cassumeorgvid | varchar(20) |  | 组织_版本信息 (org_v) |
| 8 | cassumedeptid | 费用承担部门 | cassumedeptid | varchar(20) |  | 组织_部门 (dept) |
| 9 | cassumedeptvid | 费用承担部门版本信息 | cassumedeptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 10 | ccostsubjid | 收支项目 | ccostsubjid | varchar(20) |  | 收支项目 (inoutbusiclass) |
| 11 | cprodlineid | 产品线 | cprodlineid | varchar(20) |  | 产品线 (prodline) |
| 12 | cbrandid | 品牌 | cbrandid | varchar(20) |  | 品牌档案 (branddoc) |
| 13 | cprofitcenterid | 利润中心 | cprofitcenterid | varchar(20) |  | 利润中心 (profitcenter) |
| 14 | cprofitcentervid | 利润中心版本信息 | cprofitcentervid | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 15 | ccostcenterid | 成本中心 | ccostcenterid | varchar(20) |  | 成本中心 (resacostcenter) |
| 16 | cfactorid | 核算要素 | cfactorid | varchar(20) |  | 要素基本信息 (FactorAsoa) |
| 17 | cfeeprojectid | 费用归集项目 | cfeeprojectid | varchar(20) |  | 项目 (project) |
| 18 | cfeecustomerid | 费用归集客户 | cfeecustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 19 | norigmny | 费用支持金额 | norigmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 20 | nmny | 本币费用支持金额 | nmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | ngroupmny | 集团本币费用支持金额 | ngroupmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | nglobalmny | 全局本币费用支持金额 | nglobalmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | ntotalexemny | 累计出库金额 | ntotalexemny | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | bfeecloseflag | 费用关闭 | bfeecloseflag | char(1) |  | 布尔类型 (UFBoolean) |
| 25 | ccloserid | 关闭人 | ccloserid | varchar(20) |  | 用户 (user) |
| 26 | dclosedate | 关闭日期 | dclosedate | char(19) |  | 日期 (UFDate) |
| 27 | vbnote | 备注 | vbnote | varchar(181) |  | 字符串 (String) |
| 28 | cmaterialrowno | 物料行号 | cmaterialrowno | varchar(20) |  | 字符串 (String) |
| 29 | cmaterialid | 物料 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 30 | cmaterialvid | 物料编码 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 31 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 32 | nnum | 主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 33 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 34 | nastnum | 数量 | nastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 35 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 36 | norigprice | 主单价 | norigprice | decimal(28, 8) |  | 数值 (UFDouble) |
| 37 | nmaterialorigmny | 金额 | nmaterialorigmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 38 | csendstockorgid | 发货库存组织 | csendstockorgid | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 39 | csendstockorgvid | 发货库存组织版本信息 | csendstockorgvid | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 40 | csendstordocid | 发货仓库 | csendstordocid | varchar(20) |  | 仓库 (stordoc) |
| 41 | cdelivorgvid | 物流组织版本信息 | cdelivorgvid | varchar(20) |  | 组织_业务单元_物流组织版本信息 (trafficorg_v) |
| 42 | cdelivorgid | 物流组织 | cdelivorgid | varchar(20) |  | 组织_业务单元_物流组织 (trafficorg) |
| 43 | creceiveorgid | 收货组织 | creceiveorgid | varchar(20) |  | 组织_业务单元_销售组织 (salesorg) |
| 44 | creceiveorgvid | 收货组织版本信息 | creceiveorgvid | varchar(20) |  | 组织_业务单元_销售组织版本信息 (salesorg_v) |
| 45 | creceivedeptid | 收货部门 | creceivedeptid | varchar(20) |  | 组织_部门 (dept) |
| 46 | creceivedeptvid | 收货部门版本信息 | creceivedeptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 47 | cemployeeid | 收货业务员 | cemployeeid | varchar(20) |  | 人员基本信息 (psndoc) |
| 48 | creceivecustid | 收货客户 | creceivecustid | varchar(20) |  | 客户基本信息 (customer) |
| 49 | creceiveaddrid | 收货地址 | creceiveaddrid | varchar(20) |  | 客户收货地址 (custaddress) |
| 50 | creceiveareaid | 收货地区 | creceiveareaid | varchar(20) |  | 地区分类 (areaclass) |
| 51 | creceivesiteid | 收货地点 | creceivesiteid | varchar(20) |  | 地点档案 (addressdoc) |
| 52 | dsenddate | 计划发货日期 | dsenddate | char(19) |  | 日期(结束) (UFDateEnd) |
| 53 | ntotaloutnum | 累计出库主数量 | ntotaloutnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 54 | ntotaloutmny | 累计出库执行金额 | ntotaloutmny | decimal(28, 8) |  | 数值 (UFDouble) |
| 55 | boutendflag | 出库关闭 | boutendflag | char(1) |  | 布尔类型 (UFBoolean) | N |
| 56 | vbdef1 | 自定义项1 | vbdef1 | varchar(101) |  | 自定义项 (Custom) |
| 57 | vbdef2 | 自定义项2 | vbdef2 | varchar(101) |  | 自定义项 (Custom) |
| 58 | vbdef3 | 自定义项3 | vbdef3 | varchar(101) |  | 自定义项 (Custom) |
| 59 | vbdef4 | 自定义项4 | vbdef4 | varchar(101) |  | 自定义项 (Custom) |
| 60 | vbdef5 | 自定义项5 | vbdef5 | varchar(101) |  | 自定义项 (Custom) |
| 61 | vbdef6 | 自定义项6 | vbdef6 | varchar(101) |  | 自定义项 (Custom) |
| 62 | vbdef7 | 自定义项7 | vbdef7 | varchar(101) |  | 自定义项 (Custom) |
| 63 | vbdef8 | 自定义项8 | vbdef8 | varchar(101) |  | 自定义项 (Custom) |
| 64 | vbdef9 | 自定义项9 | vbdef9 | varchar(101) |  | 自定义项 (Custom) |
| 65 | vbdef10 | 自定义项10 | vbdef10 | varchar(101) |  | 自定义项 (Custom) |
| 66 | vbdef11 | 自定义项11 | vbdef11 | varchar(101) |  | 自定义项 (Custom) |
| 67 | vbdef12 | 自定义项12 | vbdef12 | varchar(101) |  | 自定义项 (Custom) |
| 68 | vbdef13 | 自定义项13 | vbdef13 | varchar(101) |  | 自定义项 (Custom) |
| 69 | vbdef14 | 自定义项14 | vbdef14 | varchar(101) |  | 自定义项 (Custom) |
| 70 | vbdef15 | 自定义项15 | vbdef15 | varchar(101) |  | 自定义项 (Custom) |
| 71 | vbdef16 | 自定义项16 | vbdef16 | varchar(101) |  | 自定义项 (Custom) |
| 72 | vbdef17 | 自定义项17 | vbdef17 | varchar(101) |  | 自定义项 (Custom) |
| 73 | vbdef18 | 自定义项18 | vbdef18 | varchar(101) |  | 自定义项 (Custom) |
| 74 | vbdef19 | 自定义项19 | vbdef19 | varchar(101) |  | 自定义项 (Custom) |
| 75 | vbdef20 | 自定义项20 | vbdef20 | varchar(101) |  | 自定义项 (Custom) |
| 76 | vfree1 | 自由辅助属性1 | vfree1 | varchar(101) |  | 自由项 (Custom) |
| 77 | vfree2 | 自由辅助属性2 | vfree2 | varchar(101) |  | 自由项 (Custom) |
| 78 | vfree3 | 自由辅助属性3 | vfree3 | varchar(101) |  | 自由项 (Custom) |
| 79 | vfree4 | 自由辅助属性4 | vfree4 | varchar(101) |  | 自由项 (Custom) |
| 80 | vfree5 | 自由辅助属性5 | vfree5 | varchar(101) |  | 自由项 (Custom) |
| 81 | vfree6 | 自由辅助属性6 | vfree6 | varchar(101) |  | 自由项 (Custom) |
| 82 | vfree7 | 自由辅助属性7 | vfree7 | varchar(101) |  | 自由项 (Custom) |
| 83 | vfree8 | 自由辅助属性8 | vfree8 | varchar(101) |  | 自由项 (Custom) |
| 84 | vfree9 | 自由辅助属性9 | vfree9 | varchar(101) |  | 自由项 (Custom) |
| 85 | vfree10 | 自由辅助属性10 | vfree10 | varchar(101) |  | 自由项 (Custom) |