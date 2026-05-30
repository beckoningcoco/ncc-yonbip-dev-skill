# |<<

**主辅计量平衡表体 (ic_adjustbal_b / nc.vo.ic.m52.entity.AdjustBalBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2865.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cgeneralbid | 主辅计量平衡表体主键 | cgeneralbid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | corpoid | 公司最新版本 | corpoid | varchar(20) |  | 组织_业务单元_公司 (corp) |
| 4 | corpvid | 公司 | corpvid | varchar(20) |  | 组织_业务单元_公司版本信息 (corp_v) |
| 5 | pk_org | 库存组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 6 | pk_org_v | 库存组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 7 | cdptid | 部门最新版本 | cdptid | varchar(20) |  | 组织_部门 (dept) |
| 8 | cdptvid | 部门 | cdptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 9 | csourcetype | 来源单据类型 | csourcetype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 10 | csourcetranstype | 来源单据交易类型 | csourcetranstype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 11 | vsourcebillcode | 来源单据号 | vsourcebillcode | varchar(40) |  | 字符串 (String) |
| 12 | vsourcerowno | 来源单据行号 | vsourcerowno | varchar(20) |  | 字符串 (String) |
| 13 | csourcebillhid | 来源单据表头主键 | csourcebillhid | varchar(20) |  | 主键 (UFID) |
| 14 | csourcebillbid | 来源单据表体主键 | csourcebillbid | varchar(20) |  | 主键 (UFID) |
| 15 | vtrantypecode | 交易类型编码 | vtrantypecode | varchar(20) |  | 字符串 (String) |
| 16 | cmaterialoid | 物料 | cmaterialoid | varchar(20) |  | 物料基本信息 (material_v) |
| 17 | cmaterialvid | 物料编码 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 18 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 19 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 20 | nnum | 主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | nassistnum | 数量 | nassistnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 22 | ngrossnum | 毛重 | ngrossnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 23 | nadjustnum | 调差主数量 | nadjustnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | nadjustastnum | 调差数量 | nadjustastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | nadjustgrossnum | 调整毛重 | nadjustgrossnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | badjusterr | 调差 | badjusterr | char(1) |  | 布尔类型 (UFBoolean) |
| 27 | cwarehouseid | 仓库 | cwarehouseid | varchar(20) |  | 仓库 (stordoc) |
| 28 | ctargetbillid | 目标单据表头主键 | ctargetbillid | varchar(20) |  | 主键 (UFID) |
| 29 | ctargetbillcode | 目标单据号 | ctargetbillcode | varchar(40) |  | 字符串 (String) |
| 30 | vbatchcode | 批次号 | vbatchcode | varchar(40) |  | 字符串 (String) |
| 31 | cffileid | 特征码 | cffileid | varchar(20) |  | 特征码档案 (bd_ffile) |
| 32 | vbdef1 | 表体自定义项1 | vbdef1 | varchar(101) |  | 自定义项 (Custom) |
| 33 | vbdef2 | 表体自定义项2 | vbdef2 | varchar(101) |  | 自定义项 (Custom) |
| 34 | vbdef3 | 表体自定义项3 | vbdef3 | varchar(101) |  | 自定义项 (Custom) |
| 35 | vbdef4 | 表体自定义项4 | vbdef4 | varchar(101) |  | 自定义项 (Custom) |
| 36 | vbdef5 | 表体自定义项5 | vbdef5 | varchar(101) |  | 自定义项 (Custom) |
| 37 | vbdef6 | 表体自定义项6 | vbdef6 | varchar(101) |  | 自定义项 (Custom) |
| 38 | vbdef7 | 表体自定义项7 | vbdef7 | varchar(101) |  | 自定义项 (Custom) |
| 39 | vbdef8 | 表体自定义项8 | vbdef8 | varchar(101) |  | 自定义项 (Custom) |
| 40 | vbdef9 | 表体自定义项9 | vbdef9 | varchar(101) |  | 自定义项 (Custom) |
| 41 | vbdef10 | 表体自定义项10 | vbdef10 | varchar(101) |  | 自定义项 (Custom) |
| 42 | vbdef11 | 表体自定义项11 | vbdef11 | varchar(101) |  | 自定义项 (Custom) |
| 43 | vbdef12 | 表体自定义项12 | vbdef12 | varchar(101) |  | 自定义项 (Custom) |
| 44 | vbdef13 | 表体自定义项13 | vbdef13 | varchar(101) |  | 自定义项 (Custom) |
| 45 | vbdef14 | 表体自定义项14 | vbdef14 | varchar(101) |  | 自定义项 (Custom) |
| 46 | vbdef15 | 表体自定义项15 | vbdef15 | varchar(101) |  | 自定义项 (Custom) |
| 47 | vbdef16 | 表体自定义项16 | vbdef16 | varchar(101) |  | 自定义项 (Custom) |
| 48 | vbdef17 | 表体自定义项17 | vbdef17 | varchar(101) |  | 自定义项 (Custom) |
| 49 | vbdef18 | 表体自定义项18 | vbdef18 | varchar(101) |  | 自定义项 (Custom) |
| 50 | vbdef19 | 表体自定义项19 | vbdef19 | varchar(101) |  | 自定义项 (Custom) |
| 51 | vbdef20 | 表体自定义项20 | vbdef20 | varchar(101) |  | 自定义项 (Custom) |
| 52 | vbdef21 | 表体自定义项21 | vbdef21 | varchar(101) |  | 自定义项 (Custom) |
| 53 | vbdef22 | 表体自定义项22 | vbdef22 | varchar(101) |  | 自定义项 (Custom) |
| 54 | vbdef23 | 表体自定义项23 | vbdef23 | varchar(101) |  | 自定义项 (Custom) |
| 55 | vbdef24 | 表体自定义项24 | vbdef24 | varchar(101) |  | 自定义项 (Custom) |
| 56 | vbdef25 | 表体自定义项25 | vbdef25 | varchar(101) |  | 自定义项 (Custom) |
| 57 | vbdef26 | 表体自定义项26 | vbdef26 | varchar(101) |  | 自定义项 (Custom) |
| 58 | vbdef27 | 表体自定义项27 | vbdef27 | varchar(101) |  | 自定义项 (Custom) |
| 59 | vbdef28 | 表体自定义项28 | vbdef28 | varchar(101) |  | 自定义项 (Custom) |
| 60 | vbdef29 | 表体自定义项29 | vbdef29 | varchar(101) |  | 自定义项 (Custom) |
| 61 | vbdef30 | 表体自定义项30 | vbdef30 | varchar(101) |  | 自定义项 (Custom) |
| 62 | vbdef31 | 表体自定义项31 | vbdef31 | varchar(101) |  | 自定义项 (Custom) |
| 63 | vbdef32 | 表体自定义项32 | vbdef32 | varchar(101) |  | 自定义项 (Custom) |
| 64 | vbdef33 | 表体自定义项33 | vbdef33 | varchar(101) |  | 自定义项 (Custom) |
| 65 | vbdef34 | 表体自定义项34 | vbdef34 | varchar(101) |  | 自定义项 (Custom) |
| 66 | vbdef35 | 表体自定义项35 | vbdef35 | varchar(101) |  | 自定义项 (Custom) |
| 67 | vbdef36 | 表体自定义项36 | vbdef36 | varchar(101) |  | 自定义项 (Custom) |
| 68 | vbdef37 | 表体自定义项37 | vbdef37 | varchar(101) |  | 自定义项 (Custom) |
| 69 | vbdef38 | 表体自定义项38 | vbdef38 | varchar(101) |  | 自定义项 (Custom) |
| 70 | vbdef39 | 表体自定义项39 | vbdef39 | varchar(101) |  | 自定义项 (Custom) |
| 71 | vbdef40 | 表体自定义项40 | vbdef40 | varchar(101) |  | 自定义项 (Custom) |
| 72 | vbdef41 | 表体自定义项41 | vbdef41 | varchar(101) |  | 自定义项 (Custom) |
| 73 | vbdef42 | 表体自定义项42 | vbdef42 | varchar(101) |  | 自定义项 (Custom) |
| 74 | vbdef43 | 表体自定义项43 | vbdef43 | varchar(101) |  | 自定义项 (Custom) |
| 75 | vbdef44 | 表体自定义项44 | vbdef44 | varchar(101) |  | 自定义项 (Custom) |
| 76 | vbdef45 | 表体自定义项45 | vbdef45 | varchar(101) |  | 自定义项 (Custom) |
| 77 | vbdef46 | 表体自定义项46 | vbdef46 | varchar(101) |  | 自定义项 (Custom) |
| 78 | vbdef47 | 表体自定义项47 | vbdef47 | varchar(101) |  | 自定义项 (Custom) |
| 79 | vbdef48 | 表体自定义项48 | vbdef48 | varchar(101) |  | 自定义项 (Custom) |
| 80 | vbdef49 | 表体自定义项49 | vbdef49 | varchar(101) |  | 自定义项 (Custom) |
| 81 | vbdef50 | 表体自定义项50 | vbdef50 | varchar(101) |  | 自定义项 (Custom) |