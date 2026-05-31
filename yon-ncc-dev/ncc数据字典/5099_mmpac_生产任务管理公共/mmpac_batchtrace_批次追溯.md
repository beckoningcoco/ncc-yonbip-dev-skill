# |<<

**批次追溯 (mmpac_batchtrace / nc.vo.mmpac.batchass.trace.entity.BatchTraceHeadVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3805.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cbatchtraceid | 批次追溯 | cbatchtraceid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | approver | 审核人 | approver | varchar(20) |  | 用户 (user) |
| 4 | approvertime | 审核日期 | approvertime | varchar(19) |  | 日期时间 (UFDateTime) |
| 5 | pk_org | 工厂 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 6 | pk_org_v | 工厂版本 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 7 | vbatchcode | 生产批次号 | vbatchcode | varchar(40) |  | 字符串 (String) |
| 8 | vbatchcodeid | 生产批次号id | vbatchcodeid | char(20) |  | 主键 (UFID) |
| 9 | cmoid | 生产订单id | cmoid | char(20) |  | 主键 (UFID) |
| 10 | vmobillcode | 生产订单号 | vmobillcode | varchar(50) |  | 字符串 (String) |
| 11 | vmobilltype | 生产订单类型 | vmobilltype | varchar(50) |  | 字符串 (String) |
| 12 | cmohid | 生产订单头id | cmohid | char(20) |  | 主键 (UFID) |
| 13 | vmorowno | 生产订单行号 | vmorowno | varchar(50) |  | 字符串 (String) |
| 14 | cdeptid | 生产部门 | cdeptid | varchar(20) |  | 组织_部门 (dept) |
| 15 | cdeptvid | 生产部门版本 | cdeptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 16 | cwkid | 工作中心 | cwkid | varchar(20) |  | 工作中心 (bd_wk) |
| 17 | cteamid | 班组 | cteamid | varchar(20) |  | 班组定义维护表信息 (bd_team) |
| 18 | cshiftid | 班次 | cshiftid | varchar(20) |  | 班次 (bdshift) |
| 19 | cmaterialid | 产品 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 20 | cmaterialvid | 产品版本 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 21 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 22 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 23 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 24 | nwrastnum | 完工数量 | nwrastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 25 | nwrnum | 完工主数量 | nwrnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 26 | tactstarttime | 实际开工时间 | tactstarttime | char(19) |  | 日期时间 (UFDateTime) |
| 27 | tactendtime | 实际完工时间 | tactendtime | char(19) |  | 日期时间 (UFDateTime) |
| 28 | vsalebillid | 销售订单id | vsalebillid | char(20) |  | 主键 (UFID) |
| 29 | vsalebillcode | 销售订单号 | vsalebillcode | varchar(50) |  | 字符串 (String) |
| 30 | customerid | 客户 | customerid | varchar(20) |  | 客户基本信息 (customer) |
| 31 | vnote | 备注 | vnote | varchar(181) |  | 字符串 (String) |
| 32 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 33 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 34 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 35 | ccustomerid | 表体客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 36 | cffileid | 特征码 | cffileid | varchar(20) |  | 特征码档案 (bd_ffile) |
| 37 | cserialcodeid | 序列号标识 | cserialcodeid | char(20) |  | 主键 (UFID) |
| 38 | vserialcode | 序列号 | vserialcode | varchar(40) |  | 字符串 (String) |
| 39 | pk_wr_serialno | 生产报告序列号 | pk_wr_serialno | varchar(20) |  | 字符串 (String) |
| 40 | vfree1 | 自由辅助属性1 | vfree1 | varchar(101) |  | 自由项 (Custom) |
| 41 | vfree2 | 自由辅助属性2 | vfree2 | varchar(101) |  | 自由项 (Custom) |
| 42 | vfree3 | 自由辅助属性3 | vfree3 | varchar(101) |  | 自由项 (Custom) |
| 43 | vfree4 | 自由辅助属性4 | vfree4 | varchar(101) |  | 自由项 (Custom) |
| 44 | vfree5 | 自由辅助属性5 | vfree5 | varchar(101) |  | 自由项 (Custom) |
| 45 | vfree6 | 自由辅助属性6 | vfree6 | varchar(101) |  | 自由项 (Custom) |
| 46 | vfree7 | 自由辅助属性7 | vfree7 | varchar(101) |  | 自由项 (Custom) |
| 47 | vfree8 | 自由辅助属性8 | vfree8 | varchar(101) |  | 自由项 (Custom) |
| 48 | vfree9 | 自由辅助属性9 | vfree9 | varchar(101) |  | 自由项 (Custom) |
| 49 | vfree10 | 自由辅助属性10 | vfree10 | varchar(101) |  | 自由项 (Custom) |
| 50 | vdef1 | 自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 51 | vdef2 | 自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 52 | vdef3 | 自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 53 | vdef4 | 自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 54 | vdef5 | 自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 55 | vdef6 | 自定义项6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 56 | vdef7 | 自定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 57 | vdef8 | 自定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 58 | vdef9 | 自定义项9 | vdef9 | varchar(101) |  | 自定义项 (Custom) |
| 59 | vdef10 | 自定义项10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |
| 60 | vdef11 | 自定义项11 | vdef11 | varchar(101) |  | 自定义项 (Custom) |
| 61 | vdef12 | 自定义项12 | vdef12 | varchar(101) |  | 自定义项 (Custom) |
| 62 | vdef13 | 自定义项13 | vdef13 | varchar(101) |  | 自定义项 (Custom) |
| 63 | vdef14 | 自定义项14 | vdef14 | varchar(101) |  | 自定义项 (Custom) |
| 64 | vdef15 | 自定义项15 | vdef15 | varchar(101) |  | 自定义项 (Custom) |
| 65 | vdef16 | 自定义项16 | vdef16 | varchar(101) |  | 自定义项 (Custom) |
| 66 | vdef17 | 自定义项17 | vdef17 | varchar(101) |  | 自定义项 (Custom) |
| 67 | vdef18 | 自定义项18 | vdef18 | varchar(101) |  | 自定义项 (Custom) |
| 68 | vdef19 | 自定义项19 | vdef19 | varchar(101) |  | 自定义项 (Custom) |
| 69 | vdef20 | 自定义项20 | vdef20 | varchar(101) |  | 自定义项 (Custom) |
| 70 | creator | 创建人 | creator | varchar(20) |  | 用户 (user) |
| 71 | creationtime | 创建时间 | creationtime | char(19) |  | 日期时间 (UFDateTime) |
| 72 | modifier | 修改人 | modifier | varchar(20) |  | 用户 (user) |
| 73 | modifiedtime | 修改时间 | modifiedtime | varchar(19) |  | 日期时间 (UFDateTime) |