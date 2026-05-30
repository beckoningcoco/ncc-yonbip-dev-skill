# |<<

**装箱单 (ic_packbill_b / nc.vo.ic.m4w.entity.PackBillBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2948.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cpackbillid | 装箱单主键 | cpackbillid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 库存组织最新版本 | pk_org | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 4 | pk_org_v | 库存组织 | pk_org_v | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 5 | corpoid | 公司最新版本 | corpoid | varchar(20) |  | 组织_业务单元_公司 (corp) |
| 6 | corpvid | 公司 | corpvid | varchar(20) |  | 组织_业务单元_公司版本信息 (corp_v) |
| 7 | cbodywarehouseid | 仓库 | cbodywarehouseid | varchar(20) |  | 仓库 (stordoc) |
| 8 | clocationid | 货位 | clocationid | varchar(20) |  | 货位 (rack) |
| 9 | cmaterialoid | 物料 | cmaterialoid | varchar(20) | √ | 物料基本信息 (material_v) |
| 10 | cmaterialvid | 物料编码 | cmaterialvid | varchar(20) | √ | 物料基本信息（多版本） (material) |
| 11 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 12 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 13 | vchangerate | 换算率 | vchangerate | varchar(60) |  | 字符串 (String) |
| 14 | vbatchcode | 批次号 | vbatchcode | varchar(40) |  | 字符串 (String) |
| 15 | csourcebillhid | 来源单据表头主键 | csourcebillhid | varchar(20) |  | 主键 (UFID) |
| 16 | csourcebillbid | 来源单据表体主键 | csourcebillbid | varchar(20) |  | 主键 (UFID) |
| 17 | vserialcode | 序列号 | vserialcode | varchar(128) |  | 字符串 (String) |
| 18 | npackagenum | 主数量 | npackagenum | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | vnotebody | 备注 | vnotebody | varchar(181) |  | 字符串 (String) |
| 20 | ccustomerid | 客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 21 | dpackdate | 装箱日期 | dpackdate | char(19) |  | 日期 (UFDate) |
| 22 | pk_batchcode | 批次主键 | pk_batchcode | varchar(20) |  | 主键 (UFID) |
| 23 | vpickbillcode | 拣货单号 | vpickbillcode | varchar(40) |  | 字符串 (String) |
| 24 | vpackcode | 箱条码 | vpackcode | varchar(50) |  | 字符串 (String) |
| 25 | vbarcode | 主条码 | vbarcode | varchar(50) |  | 字符串 (String) |
| 26 | vbarcodesub | 次条码 | vbarcodesub | varchar(50) |  | 字符串 (String) |
| 27 | bpackbillflag | 是否是装箱单 | bpackbillflag | char(1) |  | 布尔类型 (UFBoolean) |
| 28 | nbarnum | 条码数量 | nbarnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 29 | cstateid | 库存状态 | cstateid | varchar(20) |  | 库存状态 (ic_storestate) |
| 30 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 31 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 32 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 33 | csourcetype | 来源单据类型 | csourcetype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 34 | casscustid | 客户属性 | casscustid | varchar(20) |  | 客户基本信息 (customer) |
| 35 | pk_serialcode | 序列号主键 | pk_serialcode | varchar(20) |  | 序列号档案 (SerialNoVO) |
| 36 | cffileid | 特征码 | cffileid | varchar(20) |  | 特征码档案 (bd_ffile) |
| 37 | vfree1 | 自由辅助属性1 | vfree1 | varchar(101) |  | 自由项 (Custom) |
| 38 | vfree2 | 自由辅助属性2 | vfree2 | varchar(101) |  | 自由项 (Custom) |
| 39 | vfree3 | 自由辅助属性3 | vfree3 | varchar(101) |  | 自由项 (Custom) |
| 40 | vfree4 | 自由辅助属性4 | vfree4 | varchar(101) |  | 自由项 (Custom) |
| 41 | vfree5 | 自由辅助属性5 | vfree5 | varchar(101) |  | 自由项 (Custom) |
| 42 | vfree6 | 自由辅助属性6 | vfree6 | varchar(101) |  | 自由项 (Custom) |
| 43 | vfree7 | 自由辅助属性7 | vfree7 | varchar(101) |  | 自由项 (Custom) |
| 44 | vfree8 | 自由辅助属性8 | vfree8 | varchar(101) |  | 自由项 (Custom) |
| 45 | vfree9 | 自由辅助属性9 | vfree9 | varchar(101) |  | 自由项 (Custom) |
| 46 | vfree10 | 自由辅助属性10 | vfree10 | varchar(101) |  | 自由项 (Custom) |