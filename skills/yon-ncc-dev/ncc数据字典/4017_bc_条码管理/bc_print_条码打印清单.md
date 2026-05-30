# |<<

**条码打印清单 (bc_print / nc.vo.application.bcprint.entity.BCPrintVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/244.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_bcprint | 条码清单主键 | pk_bcprint | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 打印组织 | pk_org | varchar(20) |  | 组织 (org) |
| 4 | cmaterialoid | 物料 | cmaterialoid | varchar(20) |  | 物料基本信息 (material_v) |
| 5 | cmaterialvid | 物料编码 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 6 | casscustid | 客户 | casscustid | varchar(20) |  | 客户基本信息 (customer) |
| 7 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 8 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 9 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 10 | vbatchcode | 批次号 | vbatchcode | varchar(50) |  | 字符串 (String) |
| 11 | pk_batchcode | 批次主键 | pk_batchcode | varchar(20) |  | 批次档案 (BatchcodeVO) |
| 12 | vvendbatchcode | 供应商批次号 | vvendbatchcode | varchar(50) |  | 字符串 (String) |
| 13 | cqualitylevelid | 质量等级 | cqualitylevelid | varchar(20) |  | 质量等级 (scm_qualitylevel_b) |
| 14 | dproducedate | 生产日期 | dproducedate | char(19) |  | 日期 (UFDate) |
| 15 | dinbounddate | 首次入库日期 | dinbounddate | char(19) |  | 日期 (UFDate) |
| 16 | vprodbatchcode | 生产批次号 | vprodbatchcode | varchar(50) |  | 字符串 (String) |
| 17 | pk_prodbatchcode | 生产批次号主键 | pk_prodbatchcode | varchar(20) |  | 生产批次档案 (pd_pb) |
| 18 | cproducteddept_v | 生产部门 | cproducteddept_v | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 19 | cproducteddept | 生产部门最新版本 | cproducteddept | varchar(20) |  | 组织_部门 (dept) |
| 20 | cteamid | 班组 | cteamid | varchar(20) |  | 班组定义维护表信息 (bd_team) |
| 21 | cwkid | 工作中心 | cwkid | varchar(20) |  | 工作中心 (bd_wk) |
| 22 | pk_codeeditor | 条码标签模板主键 | pk_codeeditor | varchar(20) |  | 字符串 (String) |
| 23 | factory_v | 工厂 | factory_v | varchar(20) |  | 组织_业务单元_工厂版本信息 (factory_v) |
| 24 | factory | 工厂最新版本 | factory | varchar(20) |  | 组织_业务单元_工厂 (factory) |
| 25 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 26 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 27 | nnum | 主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 28 | nassistnum | 数量 | nassistnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 29 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 30 | pk_barcoderule | 物料条形码规则 | pk_barcoderule | varchar(20) |  | 条码规则 (barcoderule_v) |
| 31 | ctemplateid | 条形码标签 | ctemplateid | varchar(20) |  | 条码标签 (bc_barcodelabel) |
| 32 | vbarcode | 条形码 | vbarcode | varchar(1850) |  | 字符串 (String) |
| 33 | vserialcode | 序列号 | vserialcode | varchar(128) |  | 字符串 (String) |
| 34 | pk_serialcode | 序列号主键 | pk_serialcode | varchar(20) |  | 序列号档案 (SerialNoVO) |
| 35 | iprintcount | 打印份数 | iprintcount | int |  | 整数 (Integer) |
| 36 | bhassource | 是否有来源 | bhassource | char(1) |  | 布尔类型 (UFBoolean) |
| 37 | ccfileid | 特征码 | ccfileid | varchar(20) |  | 特征码档案 (bd_ffile) |
| 38 | dvalidate | 失效日期 | dvalidate | char(19) |  | 日期 (UFDate) |
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
| 49 | vdef1 | 表头自定义项1 | vdef1 | varchar(101) |  | 自定义项 (Custom) |
| 50 | vdef2 | 表头自定义项2 | vdef2 | varchar(101) |  | 自定义项 (Custom) |
| 51 | vdef3 | 表头自定义项3 | vdef3 | varchar(101) |  | 自定义项 (Custom) |
| 52 | vdef4 | 表头自定义项4 | vdef4 | varchar(101) |  | 自定义项 (Custom) |
| 53 | vdef5 | 表头自定义项5 | vdef5 | varchar(101) |  | 自定义项 (Custom) |
| 54 | vdef6 | 表头自定义项6 | vdef6 | varchar(101) |  | 自定义项 (Custom) |
| 55 | vdef7 | 表头自定义项7 | vdef7 | varchar(101) |  | 自定义项 (Custom) |
| 56 | vdef8 | 表头自定义项8 | vdef8 | varchar(101) |  | 自定义项 (Custom) |
| 57 | vdef9 | 表头自定义项9 | vdef9 | varchar(101) |  | 自定义项 (Custom) |
| 58 | vdef10 | 表头自定义项10 | vdef10 | varchar(101) |  | 自定义项 (Custom) |
| 59 | vdef11 | 表头自定义项11 | vdef11 | varchar(101) |  | 自定义项 (Custom) |
| 60 | vdef12 | 表头自定义项12 | vdef12 | varchar(101) |  | 自定义项 (Custom) |
| 61 | vdef13 | 表头自定义项13 | vdef13 | varchar(101) |  | 自定义项 (Custom) |
| 62 | vdef14 | 表头自定义项14 | vdef14 | varchar(101) |  | 自定义项 (Custom) |
| 63 | vdef15 | 表头自定义项15 | vdef15 | varchar(101) |  | 自定义项 (Custom) |
| 64 | vdef16 | 表头自定义项16 | vdef16 | varchar(101) |  | 自定义项 (Custom) |
| 65 | vdef17 | 表头自定义项17 | vdef17 | varchar(101) |  | 自定义项 (Custom) |
| 66 | vdef18 | 表头自定义项18 | vdef18 | varchar(101) |  | 自定义项 (Custom) |
| 67 | vdef19 | 表头自定义项19 | vdef19 | varchar(101) |  | 自定义项 (Custom) |
| 68 | vdef20 | 表头自定义项20 | vdef20 | varchar(101) |  | 自定义项 (Custom) |