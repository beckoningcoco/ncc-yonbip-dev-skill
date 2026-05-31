# |<<

**工序转移明细 (mm_transfer_b / nc.vo.mmsfc.transfer.entity.TransferItemVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3794.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_transfer_b | 工序转移明细 | pk_transfer_b | char(20) | √ | 主键 (UFID) |
| 2 | vrowno | 序号 | vrowno | varchar(20) |  | 字符串 (String) |
| 3 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 4 | pk_org | 工厂最新版本 | pk_org | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 5 | pk_org_v | 工厂 | pk_org_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 6 | cbmaterialvid | 产品版本 | cbmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 7 | cbmaterialid | 产品 | cbmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 8 | vbfromoperationno | 从工序号 | vbfromoperationno | varchar(20) |  | 字符串 (String) |
| 9 | vbfromoperatiotypeid | 从工序类型 | vbfromoperatiotypeid | varchar(20) |  | 标准工序 (pd_rc) |
| 10 | vbtooperationno | 到工序号 | vbtooperationno | varchar(20) |  | 字符串 (String) |
| 11 | vbdmoopid | 到离散工序号 | vbdmoopid | varchar(20) |  | 工序计划 (mm_dmo_procedure) |
| 12 | vbpmoopid | 到流程工序号 | vbpmoopid | varchar(20) |  | 工序计划明细 (mm_pmo_procedure) |
| 13 | cbtooperationtypeid | 到工序类型 | cbtooperationtypeid | varchar(20) |  | 标准工序 (pd_rc) |
| 14 | nbtransferum | 转移主数量 | nbtransferum | decimal(28, 8) |  | 数值 (UFDouble) |
| 15 | nbasttransferum | 转移数量 | nbasttransferum | decimal(28, 8) |  | 数值 (UFDouble) |
| 16 | vbchangerate | 换算率 | vbchangerate | varchar(60) |  | 字符串 (String) |
| 17 | cbunitid | 主单位 | cbunitid | varchar(20) |  | 计量单位 (measdoc) |
| 18 | cbastunitid | 单位 | cbastunitid | varchar(20) |  | 计量单位 (measdoc) |
| 19 | cbprojectid | 项目 | cbprojectid | varchar(20) |  | 项目 (project) |
| 20 | cbproductorid | 生产厂商 | cbproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 21 | cbvendorid | 供应商 | cbvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 22 | cbcustomerid | 客户 | cbcustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 23 | cffileid | 特征码 | cffileid | varchar(20) |  | 特征码档案 (bd_ffile) |
| 24 | cbcustmaterialid | 客户物料码 | cbcustmaterialid | varchar(20) |  | 客户物料码 (custmaterial) |
| 25 | cmoid | 生产订单 | cmoid | char(20) |  | 字符串 (String) |
| 26 | vmobillcode | 生产订单号 | vmobillcode | varchar(40) |  | 字符串 (String) |
| 27 | vmobilltype | 生产订单单据类型 | vmobilltype | varchar(20) |  | 字符串 (String) |
| 28 | vmotrantypeid | 生产订单交易类型 | vmotrantypeid | varchar(20) |  | 字符串 (String) |
| 29 | vmotrantypecode | 生产订单交易类型编码 | vmotrantypecode | varchar(20) |  | 字符串 (String) |
| 30 | cmooutputid | 生产订单表体 | cmooutputid | char(20) |  | 字符串 (String) |
| 31 | vmoplanoutputrowno | 生产订单产品行号 | vmoplanoutputrowno | varchar(20) |  | 字符串 (String) |
| 32 | cmoprocedureid | 生产订单工序计划 | cmoprocedureid | varchar(20) |  | 字符串 (String) |
| 33 | vmoprocedurerowno | 生产订单工序行号 | vmoprocedurerowno | varchar(20) |  | 字符串 (String) |
| 34 | vsrcid | 来源单据表头 | vsrcid | varchar(20) |  | 字符串 (String) |
| 35 | vsrcbid | 来源单据表体 | vsrcbid | varchar(20) |  | 字符串 (String) |
| 36 | vsrcrowno | 来源单据行号 | vsrcrowno | varchar(20) |  | 字符串 (String) |
| 37 | vsrctype | 来源单据类型 | vsrctype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 38 | vsrccode | 来源单据号 | vsrccode | varchar(40) |  | 字符串 (String) |
| 39 | vsrctrantype | 来源交易类型编码 | vsrctrantype | varchar(20) |  | 字符串 (String) |
| 40 | vsrctrantypeid | 来源交易类型 | vsrctrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 41 | vfirstid | 源头单据表头 | vfirstid | varchar(20) |  | 字符串 (String) |
| 42 | vfirstbid | 源头单据表体 | vfirstbid | varchar(20) |  | 字符串 (String) |
| 43 | vfirstrowno | 源头单据行号 | vfirstrowno | varchar(20) |  | 字符串 (String) |
| 44 | vfirsttype | 源头单据类型 | vfirsttype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 45 | vfirstcode | 源头单据号 | vfirstcode | varchar(40) |  | 字符串 (String) |
| 46 | vfirsttrantype | 源头交易类型编码 | vfirsttrantype | varchar(20) |  | 字符串 (String) |
| 47 | vfirsttrantypeid | 源头交易类型 | vfirsttrantypeid | varchar(20) |  | 单据类型 (BilltypeVO) |
| 48 | cbfromwkid | 从工作中心 | cbfromwkid | varchar(20) |  | 工作中心 (bd_wk) |
| 49 | cbtowkid | 到工作中心 | cbtowkid | varchar(20) |  | 工作中心 (bd_wk) |
| 50 | cbfromdeptid | 从生产部门 | cbfromdeptid | varchar(20) |  | 组织_部门 (dept) |
| 51 | cbtodeptid | 到生产部门 | cbtodeptid | varchar(20) |  | 组织_部门 (dept) |
| 52 | cbfromdeptvid | 从生产部门版本 | cbfromdeptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 53 | cbtodeptvid | 到生产部门版本 | cbtodeptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 54 | vbatchcode | 生产批次号 | vbatchcode | varchar(40) |  | 字符串 (String) |
| 55 | cbatchid | 生产批次 | cbatchid | varchar(20) |  | 字符串 (String) |
| 56 | cbfirstmoid | 源头生产订单 | cbfirstmoid | varchar(20) |  | 字符串 (String) |
| 57 | vbfirstmocode | 源头生产订单号 | vbfirstmocode | varchar(40) |  | 字符串 (String) |
| 58 | vbnote | 备注 | vbnote | varchar(181) |  | 字符串 (String) |
| 59 | transferer | 交接人 | transferer | varchar(20) |  | 人员基本信息 (psndoc) |
| 60 | nbastacceptnum | 接收数量 | nbastacceptnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 61 | accepter | 接收人 | accepter | varchar(20) |  | 人员基本信息 (psndoc) |
| 62 | responsibleperson | 责任人 | responsibleperson | varchar(20) |  | 人员基本信息 (psndoc) |
| 63 | nbacceptnum | 接收主数量 | nbacceptnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 64 | vbfree1 | 自由辅助属性1 | vbfree1 | varchar(101) |  | 自由项 (Custom) |
| 65 | vbfree2 | 自由辅助属性2 | vbfree2 | varchar(101) |  | 自由项 (Custom) |
| 66 | vbfree3 | 自由辅助属性3 | vbfree3 | varchar(101) |  | 自由项 (Custom) |
| 67 | vbfree4 | 自由辅助属性4 | vbfree4 | varchar(101) |  | 自由项 (Custom) |
| 68 | vbfree5 | 自由辅助属性5 | vbfree5 | varchar(101) |  | 自由项 (Custom) |
| 69 | vbfree6 | 自由辅助属性6 | vbfree6 | varchar(101) |  | 自由项 (Custom) |
| 70 | vbfree7 | 自由辅助属性7 | vbfree7 | varchar(101) |  | 自由项 (Custom) |
| 71 | vbfree8 | 自由辅助属性8 | vbfree8 | varchar(101) |  | 自由项 (Custom) |
| 72 | vbfree9 | 自由辅助属性9 | vbfree9 | varchar(101) |  | 自由项 (Custom) |
| 73 | vbfree10 | 自由辅助属性10 | vbfree10 | varchar(101) |  | 自由项 (Custom) |
| 74 | vbdef1 | 自定义项1 | vbdef1 | varchar(101) |  | 自定义项 (Custom) |
| 75 | vbdef2 | 自定义项2 | vbdef2 | varchar(101) |  | 自定义项 (Custom) |
| 76 | vbdef3 | 自定义项3 | vbdef3 | varchar(101) |  | 自定义项 (Custom) |
| 77 | vbdef4 | 自定义项4 | vbdef4 | varchar(101) |  | 自定义项 (Custom) |
| 78 | vbdef5 | 自定义项5 | vbdef5 | varchar(101) |  | 自定义项 (Custom) |
| 79 | vbdef6 | 自定义项6 | vbdef6 | varchar(101) |  | 自定义项 (Custom) |
| 80 | vbdef7 | 自定义项7 | vbdef7 | varchar(101) |  | 自定义项 (Custom) |
| 81 | vbdef8 | 自定义项8 | vbdef8 | varchar(101) |  | 自定义项 (Custom) |
| 82 | vbdef9 | 自定义项9 | vbdef9 | varchar(101) |  | 自定义项 (Custom) |
| 83 | vbdef10 | 自定义项10 | vbdef10 | varchar(101) |  | 自定义项 (Custom) |
| 84 | vbdef11 | 自定义项11 | vbdef11 | varchar(101) |  | 自定义项 (Custom) |
| 85 | vbdef12 | 自定义项12 | vbdef12 | varchar(101) |  | 自定义项 (Custom) |
| 86 | vbdef13 | 自定义项13 | vbdef13 | varchar(101) |  | 自定义项 (Custom) |
| 87 | vbdef14 | 自定义项14 | vbdef14 | varchar(101) |  | 自定义项 (Custom) |
| 88 | vbdef15 | 自定义项15 | vbdef15 | varchar(101) |  | 自定义项 (Custom) |
| 89 | vbdef16 | 自定义项16 | vbdef16 | varchar(101) |  | 自定义项 (Custom) |
| 90 | vbdef17 | 自定义项17 | vbdef17 | varchar(101) |  | 自定义项 (Custom) |
| 91 | vbdef18 | 自定义项18 | vbdef18 | varchar(101) |  | 自定义项 (Custom) |
| 92 | vbdef19 | 自定义项19 | vbdef19 | varchar(101) |  | 自定义项 (Custom) |
| 93 | vbdef20 | 自定义项20 | vbdef20 | varchar(101) |  | 自定义项 (Custom) |