# |<<

**工序完工报告明细 (mm_operationrep_b / nc.vo.mmsfc.operationrep.entity.OprepItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3710.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_oprep_b | 工序完工报告明细 | pk_oprep_b | char(20) | √ | 主键 (UFID) |
| 2 | vrowno | 序号 | vrowno | varchar(20) |  | 字符串 (String) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 工厂最新 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 5 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 6 | cmoid | 生产订单 | cmoid | varchar(20) |  | 字符串 (String) |
| 7 | vmobillcode | 生产订单号 | vmobillcode | varchar(40) |  | 字符串 (String) |
| 8 | vmobilltype | 生产订单单据类型 | vmobilltype | varchar(20) |  | 字符串 (String) |
| 9 | vmotrantypeid | 生产订单交易类型 | vmotrantypeid | varchar(20) |  | 字符串 (String) |
| 10 | vmotrantypecode | 生产订单交易类型编码 | vmotrantypecode | varchar(20) |  | 字符串 (String) |
| 11 | cmooutputid | 生产订单产品表体 | cmooutputid | varchar(20) |  | 字符串 (String) |
| 12 | vmooutputrowno | 生产订单产品行号 | vmooutputrowno | varchar(20) |  | 字符串 (String) |
| 13 | cmoprocedureid | 生产订单工序计划 | cmoprocedureid | varchar(20) |  | 字符串 (String) |
| 14 | vmoprocedurerowno | 生产订单工序行号 | vmoprocedurerowno | varchar(20) |  | 字符串 (String) |
| 15 | cbmaterialid | 产品最新 | cbmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 16 | cbmaterialvid | 产品 | cbmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 17 | vbchangerate | 换算率 | vbchangerate | varchar(60) |  | 字符串 (String) |
| 18 | cbunitid | 主单位 | cbunitid | varchar(20) |  | 计量单位 (measdoc) |
| 19 | cbastunitid | 单位 | cbastunitid | varchar(20) |  | 计量单位 (measdoc) |
| 20 | cbcustomerid | 客户 | cbcustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 21 | cbprojectid | 项目 | cbprojectid | varchar(20) |  | 项目 (project) |
| 22 | cbproductorid | 生产厂商 | cbproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 23 | cbvendorid | 供应商 | cbvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 24 | cbcustmaterialid | 客户物料码 | cbcustmaterialid | varchar(20) |  | 客户物料码 (custmaterial) |
| 25 | cffileid | 特征码 | cffileid | varchar(20) |  | 特征码档案 (bd_ffile) |
| 26 | vboperationno | 工序号 | vboperationno | varchar(40) |  | 字符串 (String) |
| 27 | cboperationtypeid | 工序类型 | cboperationtypeid | varchar(20) |  | 标准工序 (pd_rc) |
| 28 | cbwkid | 工作中心 | cbwkid | varchar(20) |  | 工作中心 (bd_wk) |
| 29 | cbdeptid | 生产部门最新 | cbdeptid | varchar(20) |  | 组织_部门 (dept) |
| 30 | cbdeptvid | 生产部门 | cbdeptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 31 | cbshiftid | 班次 | cbshiftid | varchar(20) |  | 班次 (bdshift) |
| 32 | cbteamid | 班组 | cbteamid | varchar(20) |  | 班组定义维护表信息 (bd_team) |
| 33 | cbworkman | 人员 | cbworkman | varchar(20) |  | 人员基本信息 (psndoc) |
| 34 | nboprepnum | 完工主数量 | nboprepnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 35 | nbastoprepnum | 完工数量 | nbastoprepnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 36 | nbqualitynum | 合格主数量(废弃) | nbqualitynum | decimal(28, 8) |  | 数值 (UFDouble) |
| 37 | nbastqualitynum | 合格数量(废弃) | nbastqualitynum | decimal(28, 8) |  | 数值 (UFDouble) |
| 38 | nbreworknum | 返工主数量(废弃) | nbreworknum | decimal(28, 8) |  | 数值 (UFDouble) |
| 39 | nbastreworknum | 返工数量(废弃) | nbastreworknum | decimal(28, 8) |  | 数值 (UFDouble) |
| 40 | nbrejectnum | 报废主数量(废弃) | nbrejectnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 41 | nbastrejectnum | 报废数量(废弃) | nbastrejectnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 42 | nbtransfernum | 累计转移主数量(废弃) | nbtransfernum | decimal(28, 8) |  | 数值 (UFDouble) |
| 43 | nbasttransfernum | 累计转移数量(废弃) | nbasttransfernum | decimal(28, 8) |  | 数值 (UFDouble) |
| 44 | nbreworkmonum | 返工补单主数量(废弃) | nbreworkmonum | decimal(28, 8) |  | 数值 (UFDouble) |
| 45 | nbastreworkmonum | 返工补单数量(废弃) | nbastreworkmonum | decimal(28, 8) |  | 数值 (UFDouble) |
| 46 | bbcheckpoint | 检测点 | bbcheckpoint | char(1) |  | 布尔类型 (UFBoolean) |
| 47 | bbreppoint | 报告点 | bbreppoint | char(1) |  | 布尔类型 (UFBoolean) |
| 48 | nbastapplychecknum | 已报检数量 | nbastapplychecknum | decimal(28, 8) |  | 数值 (UFDouble) |
| 49 | nbapplychecknum | 已报检主数量 | nbapplychecknum | decimal(28, 8) |  | 数值 (UFDouble) |
| 50 | nbastapplycheckednum | 检验完成数量 | nbastapplycheckednum | decimal(28, 8) |  | 数值 (UFDouble) |
| 51 | nbapplycheckednum | 检验完成主数量 | nbapplycheckednum | decimal(28, 8) |  | 数值 (UFDouble) |
| 52 | tbactbegintime | 实际开工时间 | tbactbegintime | char(19) |  | 日期时间 (UFDateTime) |
| 53 | tbactendtime | 实际完工时间 | tbactendtime | char(19) |  | 日期时间 (UFDateTime) |
| 54 | vbbatchid | 生产批次 | vbbatchid | varchar(20) |  | 字符串 (String) |
| 55 | vbbatchcode | 生产批次号 | vbbatchcode | varchar(40) |  | 字符串 (String) |
| 56 | cbfirstmoid | 源头生产订单 | cbfirstmoid | varchar(20) |  | 字符串 (String) |
| 57 | vbfirstmocode | 源头生产订单号 | vbfirstmocode | varchar(40) |  | 字符串 (String) |
| 58 | fbtransfertype | 工序转移方式 | fbtransfertype | int |  | 工序报告转移方式 (OprepReworkTypeEnum) |  | 1=不转移; |