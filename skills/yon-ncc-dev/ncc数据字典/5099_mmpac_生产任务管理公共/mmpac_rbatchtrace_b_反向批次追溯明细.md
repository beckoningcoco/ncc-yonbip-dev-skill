# |<<

**反向批次追溯明细 (mmpac_rbatchtrace_b / nc.vo.mmpac.batchass.rtrace.entity.RBatchTraceBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3810.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbatchtracebid | 批次追溯明细 | cbatchtracebid | varchar(50) | √ | 字符串 (String) |
| 2 | cbatchtraceid | 批次追溯 | cbatchtraceid | varchar(50) |  | 字符串 (String) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 6 | vbatchcode | 生产批次号 | vbatchcode | varchar(40) |  | 字符串 (String) |
| 7 | vbatchcodeid | 生产批次号id | vbatchcodeid | char(20) |  | 主键 (UFID) |
| 8 | cmoid | 生产订单id | cmoid | char(20) |  | 主键 (UFID) |
| 9 | vmobillcode | 生产订单号 | vmobillcode | varchar(50) |  | 字符串 (String) |
| 10 | vmobilltype | 生产订单类型 | vmobilltype | varchar(50) |  | 字符串 (String) |
| 11 | cmohid | 生产订单头id | cmohid | char(20) |  | 主键 (UFID) |
| 12 | vmorowno | 生产订单行号 | vmorowno | varchar(50) |  | 字符串 (String) |
| 13 | cdeptid | 生产部门 | cdeptid | varchar(20) |  | 组织_部门 (dept) |
| 14 | cdeptvid | 生产部门版本 | cdeptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 15 | cwkid | 工作中心 | cwkid | varchar(20) |  | 工作中心 (bd_wk) |
| 16 | cteamid | 班组 | cteamid | varchar(20) |  | 班组定义维护表信息 (bd_team) |
| 17 | cshiftid | 班次 | cshiftid | varchar(20) |  | 班次 (bdshift) |
| 18 | cmaterialid | 产品 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 19 | cmaterialvid | 产品版本 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 20 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 21 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 22 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 23 | nwrastnum | 完工数量 | nwrastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 24 | nwrnum | 完工主数量 | nwrnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | tactstarttime | 实际开始时间 | tactstarttime | char(19) |  | 日期时间 (UFDateTime) |
| 26 | tactendtime | 实际结束时间 | tactendtime | char(19) |  | 日期时间 (UFDateTime) |
| 27 | vsalebillid | 销售订单id | vsalebillid | char(20) |  | 主键 (UFID) |
| 28 | vsalebillcode | 销售订单号 | vsalebillcode | varchar(50) |  | 字符串 (String) |
| 29 | customerid | 客户 | customerid | varchar(20) |  | 客户基本信息 (customer) |
| 30 | vnote | 备注 | vnote | varchar(181) |  | 字符串 (String) |
| 31 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 32 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 33 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 34 | ccustomerid | 表体客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 35 | cffileid | 特征码 | cffileid | varchar(20) |  | 特征码档案 (bd_ffile) |
| 36 | cbserialcodeid | 序列号标识 | cbserialcodeid | char(20) |  | 主键 (UFID) |
| 37 | vbserialcode | 序列号 | vbserialcode | varchar(40) |  | 字符串 (String) |
| 38 | pk_wr_serialno | 生产报告序列号 | pk_wr_serialno | varchar(20) |  | 字符串 (String) |
| 39 | vfree1 | 自由辅助属性1 | vfree1 | varchar(101) |  | 自由项 (Custom) |
| 40 | vfree2 | 自由辅助属性2 | vfree2 | varchar(101) |  | 自由项 (Custom) |
| 41 | vfree3 | 自由辅助属性3 | vfree3 | varchar(101) |  | 自由项 (Custom) |
| 42 | vfree4 | 自由辅助属性4 | vfree4 | varchar(101) |  | 自由项 (Custom) |
| 43 | vfree5 | 自由辅助属性5 | vfree5 | varchar(101) |  | 自由项 (Custom) |
| 44 | vfree6 | 自由辅助属性6 | vfree6 | varchar(101) |  | 自由项 (Custom) |
| 45 | vfree7 | 自由辅助属性7 | vfree7 | varchar(101) |  | 自由项 (Custom) |
| 46 | vfree8 | 自由辅助属性8 | vfree8 | varchar(101) |  | 自由项 (Custom) |
| 47 | vfree9 | 自由辅助属性9 | vfree9 | varchar(101) |  | 自由项 (Custom) |
| 48 | vfree10 | 自由辅助属性10 | vfree10 | varchar(101) |  | 自由项 (Custom) |