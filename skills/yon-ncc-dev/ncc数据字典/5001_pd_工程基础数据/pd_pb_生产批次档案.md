# |<<

**生产批次档案 (pd_pb / nc.vo.pd.pd0332.entity.PbVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4363.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_batchcode | 生产批次 | pk_batchcode | char(20) | √ | 主键 (UFID) |
| 2 | vprodbatchcode | 生产批次号 | vprodbatchcode | varchar(50) |  | 字符串 (String) |
| 3 | pk_group | 集团 | pk_group | varchar(20) | √ | 组织_集团 (group) |
| 4 | pk_org | 工厂 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 5 | pk_org_v | 工厂版本 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 6 | cdeptid | 部门 | cdeptid | varchar(20) |  | 组织_部门 (dept) |
| 7 | cdeptvid | 生产部门 | cdeptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 8 | cwkid | 工作中心 | cwkid | varchar(20) |  | 工作中心 (bd_wk) |
| 9 | cteamid | 班组 | cteamid | varchar(20) |  | 班组定义维护表信息 (bd_team) |
| 10 | cshiftid | 班次 | cshiftid | varchar(20) |  | 班次 (bdshift) |
| 11 | cmaterialid | 物料 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 12 | cmaterialvid | 物料编码 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 13 | vsrcid | 来源单据id | vsrcid | char(20) |  | 主键 (UFID) |
| 14 | vsrccode | 来源单据号 | vsrccode | varchar(50) |  | 字符串 (String) |
| 15 | vsrcrowid | 来源单据表体id | vsrcrowid | char(20) |  | 主键 (UFID) |
| 16 | vsrcrowno | 来源单据行号 | vsrcrowno | varchar(50) |  | 字符串 (String) |
| 17 | csrctype | 来源单据类型 | csrctype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 18 | csrctranstype | 来源交易类型 | csrctranstype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 19 | vsrctransid | 来源交易类型编码 | vsrctransid | varchar(50) |  | 字符串 (String) |
| 20 | vfirstid | 源头单据id | vfirstid | char(20) |  | 主键 (UFID) |
| 21 | vfirstcode | 源头单据号 | vfirstcode | varchar(50) |  | 字符串 (String) |
| 22 | vfirstrowid | 源头单据表体id | vfirstrowid | char(20) |  | 主键 (UFID) |
| 23 | vfirstrowno | 源头单据行号 | vfirstrowno | varchar(50) |  | 字符串 (String) |
| 24 | vfirsttype | 源头单据类型 | vfirsttype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 25 | cfirstranstype | 源头交易类型 | cfirstranstype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 26 | vfirstransid | 源头交易类型编码 | vfirstransid | varchar(50) |  | 字符串 (String) |
| 27 | vmoid | 生产订单id | vmoid | char(20) |  | 主键 (UFID) |
| 28 | vmocode | 生产订单号 | vmocode | varchar(50) |  | 字符串 (String) |
| 29 | vmorowid | 生产订单行id | vmorowid | char(20) |  | 主键 (UFID) |
| 30 | vmorowno | 生产订单行号 | vmorowno | varchar(50) |  | 字符串 (String) |
| 31 | ccustomerid | 客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 32 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 33 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 34 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 35 | vnote | 备注 | vnote | varchar(50) |  | 字符串 (String) |
| 36 | ctranstype | 生产批次类型 | ctranstype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 37 | nprefernum | 引用地方 | nprefernum | decimal(28, 8) |  | 数值 (UFDouble) |
| 38 | dproductdate | 生产日期 | dproductdate | char(19) |  | 日期 (UFDate) |
| 39 | vdef1 | 自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 40 | vdef2 | 自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 41 | vdef3 | 自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 42 | vdef4 | 自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 43 | vdef5 | 自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 44 | vdef6 | 自定义项6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 45 | vdef7 | 自定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 46 | vdef8 | 自定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 47 | vdef9 | 自定义项9 | vdef9 | varchar(101) |  | 自定义项 (Custom) |
| 48 | vdef10 | 自定义项10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |
| 49 | vdef11 | 自定义项11 | vdef11 | varchar(101) |  | 自定义项 (Custom) |
| 50 | vdef12 | 自定义项12 | vdef12 | varchar(101) |  | 自定义项 (Custom) |
| 51 | vdef13 | 自定义项13 | vdef13 | varchar(101) |  | 自定义项 (Custom) |
| 52 | vdef14 | 自定义项14 | vdef14 | varchar(101) |  | 自定义项 (Custom) |
| 53 | vdef15 | 自定义项15 | vdef15 | varchar(101) |  | 自定义项 (Custom) |
| 54 | vdef16 | 自定义项16 | vdef16 | varchar(101) |  | 自定义项 (Custom) |
| 55 | vdef17 | 自定义项17 | vdef17 | varchar(101) |  | 自定义项 (Custom) |
| 56 | vdef18 | 自定义项18 | vdef18 | varchar(101) |  | 自定义项 (Custom) |
| 57 | vdef19 | 自定义项19 | vdef19 | varchar(101) |  | 自定义项 (Custom) |
| 58 | vdef20 | 自定义项20 | vdef20 | varchar(101) |  | 自定义项 (Custom) |
| 59 | vfree1 | 自由辅助属性1 | vfree1 | varchar(101) |  | 自由项 (Custom) |
| 60 | vfree2 | 自由辅助属性2 | vfree2 | varchar(101) |  | 自由项 (Custom) |
| 61 | vfree3 | 自由辅助属性3 | vfree3 | varchar(101) |  | 自由项 (Custom) |
| 62 | vfree4 | 自由辅助属性4 | vfree4 | varchar(101) |  | 自由项 (Custom) |
| 63 | vfree5 | 自由辅助属性5 | vfree5 | varchar(101) |  | 自由项 (Custom) |
| 64 | vfree6 | 自由辅助属性6 | vfree6 | varchar(101) |  | 自由项 (Custom) |
| 65 | vfree7 | 自由辅助属性7 | vfree7 | varchar(101) |  | 自由项 (Custom) |
| 66 | vfree8 | 自由辅助属性8 | vfree8 | varchar(101) |  | 自由项 (Custom) |
| 67 | vfree9 | 自由辅助属性9 | vfree9 | varchar(101) |  | 自由项 (Custom) |
| 68 | vfree10 | 自由辅助属性10 | vfree10 | varchar(101) |  | 自由项 (Custom) |
| 69 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 70 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 71 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 72 | modifiedtime | 修改时间 | modifiedtime | char(19) |  | 日期时间 (UFDateTime) |