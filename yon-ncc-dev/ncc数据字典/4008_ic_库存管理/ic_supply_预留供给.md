# |<<

**预留供给 (ic_supply / nc.vo.ic.reserve.entity.SupplyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2985.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_supply | 预留供给 | pk_supply | char(20) | √ | 主键 (UFID) |
| 2 | dsupplydate | 供给日期 | dsupplydate | varchar(19) |  | 日期 (UFDate) |
| 3 | csupplyhid | 供给单据头 | csupplyhid | varchar(50) |  | 字符串 (String) |
| 4 | csupplybid | 供给单据体 | csupplybid | varchar(50) |  | 字符串 (String) |
| 5 | csupplytype | 供给单据类型 | csupplytype | varchar(50) |  | 字符串 (String) |
| 6 | csupplycode | 供给单据号 | csupplycode | varchar(50) |  | 字符串 (String) |
| 7 | csupplyrowno | 供给单据行号 | csupplyrowno | varchar(50) |  | 字符串 (String) |
| 8 | csupplytranstype | 供给单据交易类型 | csupplytranstype | varchar(50) |  | 字符串 (String) |
| 9 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 10 | pk_org_v | 库存组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 11 | pk_org | 库存组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 12 | cwarehouseid | 仓库 | cwarehouseid | varchar(20) |  | 仓库 (stordoc) |
| 13 | clocationid | 货位 | clocationid | varchar(20) |  | 货位 (rack) |
| 14 | cmaterialvid | 物料编码 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 15 | cmaterialoid | 物料 | cmaterialoid | varchar(20) |  | 物料基本信息 (material_v) |
| 16 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 17 | pk_batchcode | 批次 | pk_batchcode | varchar(20) |  | 批次档案 (BatchcodeVO) |
| 18 | vbatchcode | 批次号 | vbatchcode | varchar(40) |  | 字符串 (String) |
| 19 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 20 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 21 | casscustid | 客户 | casscustid | varchar(20) |  | 客户基本信息 (customer) |
| 22 | cproductorid | 生产厂家 | cproductorid | varchar(20) |  | 主键 (UFID) |
| 23 | ntalrsnum | 累计预留数量 | ntalrsnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | nsupplynum | 供给数量 | nsupplynum | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | ntalinnum | 累计入库数量 | ntalinnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | buseable | 是否可用 | buseable | char(1) |  | 布尔类型 (UFBoolean) |
| 27 | vfree1 | 物料自由属性1 | vfree1 | varchar(101) |  | 自由项 (Custom) |
| 28 | vfree2 | 物料自由属性2 | vfree2 | varchar(101) |  | 自由项 (Custom) |
| 29 | vfree3 | 物料自由属性3 | vfree3 | varchar(101) |  | 自由项 (Custom) |
| 30 | vfree4 | 物料自由属性4 | vfree4 | varchar(101) |  | 自由项 (Custom) |
| 31 | vfree5 | 物料自由属性5 | vfree5 | varchar(101) |  | 自由项 (Custom) |
| 32 | vfree6 | 物料自由属性6 | vfree6 | varchar(101) |  | 自由项 (Custom) |
| 33 | vfree7 | 物料自由属性7 | vfree7 | varchar(101) |  | 自由项 (Custom) |
| 34 | vfree8 | 物料自由属性8 | vfree8 | varchar(101) |  | 自由项 (Custom) |
| 35 | vfree9 | 物料自由属性9 | vfree9 | varchar(101) |  | 自由项 (Custom) |
| 36 | vfree10 | 物料自由属性10 | vfree10 | varchar(101) |  | 自由项 (Custom) |