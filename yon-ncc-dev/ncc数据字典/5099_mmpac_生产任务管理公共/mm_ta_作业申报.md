# |<<

**作业申报 (mm_ta / nc.vo.mmpac.apply.task.entity.TaskAHVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3789.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ta | 作业申报 | pk_ta | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 工厂 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 4 | pk_org_v | 工厂版本 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 5 | vbillcode | 作业申报单号 | vbillcode | varchar(40) |  | 字符串 (String) |
| 6 | cdeptid | 生产部门 | cdeptid | varchar(20) |  | 组织_部门 (dept) |
| 7 | cdeptvid | 生产部门最新版本 | cdeptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 8 | cwkid | 工作中心 | cwkid | varchar(20) |  | 工作中心 (bd_wk) |
| 9 | cmotype | 生产订单类型 | cmotype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 10 | cmoid | 生产订单 | cmoid | char(20) |  | 主键 (UFID) |
| 11 | vmocode | 生产订单号 | vmocode | varchar(40) |  | 字符串 (String) |
| 12 | cmorowid | 生产订单行 | cmorowid | char(20) |  | 主键 (UFID) |
| 13 | vmorowno | 生产订单行号 | vmorowno | varchar(20) |  | 字符串 (String) |
| 14 | cmaterialid | 产品最新版本 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 15 | cmaterialvid | 产品 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 16 | billmaker | 制单人 | billmaker | varchar(20) |  | 用户 (user) |
| 17 | dmakedate | 制单日期 | dmakedate | char(19) |  | 日期 (UFDate) |
| 18 | ftaprodmodeenum | 生产模式 | ftaprodmodeenum | int |  | 生产模式 (ProdModeEnum) |  | 2=离散; |