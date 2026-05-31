# |<<

**拣货单表体 (ic_pickbill_b / nc.vo.ic.m4v.entity.PickBillBodyVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2952.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cgeneralbid | 拣货单表体主键 | cgeneralbid | char(20) | √ | 主键 (UFID) |
| 2 | cbodywarehouseid | 仓库 | cbodywarehouseid | varchar(20) |  | 仓库 (stordoc) |
| 3 | clocationid | 货位 | clocationid | varchar(20) |  | 货位 (rack) |
| 4 | cmaterialoid | 物料 | cmaterialoid | varchar(20) | √ | 物料基本信息 (material_v) |
| 5 | cmaterialvid | 物料编码 | cmaterialvid | varchar(20) | √ | 物料基本信息（多版本） (material) |
| 6 | cunitid | 主单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 7 | castunitid | 单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 8 | vchangerate | 换算率 | vchangerate | varchar(100) |  | 字符串 (String) |
| 9 | cstateid | 库存状态 | cstateid | varchar(20) |  | 库存状态 (ic_storestate) |
| 10 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 11 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 12 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 13 | cvmivenderid | 寄存供应商 | cvmivenderid | varchar(20) |  | 供应商基本信息 (supplier) |
| 14 | ctplcustomerid | 货主客户 | ctplcustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 15 | vbatchcode | 批次号 | vbatchcode | varchar(40) |  | 字符串 (String) |
| 16 | dvalidate | 失效日期 | dvalidate | char(19) |  | 日期 (UFDate) |
| 17 | nassistnum | 实发数量 | nassistnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 18 | nnum | 实发主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 19 | vserialcode | 序列号 | vserialcode | varchar(128) |  | 字符串 (String) |
| 20 | npackagenum | 累计装箱主数量 | npackagenum | decimal(28, 8) |  | 数值 (UFDouble) |
| 21 | ccustomerid | 客户 | ccustomerid | varchar(20) |  | 客户基本信息 (customer) |
| 22 | vdiliveraddress | 收货地址 | vdiliveraddress | varchar(20) |  | 地址簿 (address) |
| 23 | vnotebody | 备注 | vnotebody | varchar(181) |  | 字符串 (String) |
| 24 | vsourcebillcode | 出库单据号 | vsourcebillcode | varchar(40) |  | 字符串 (String) |
| 25 | csourcetype | 来源单据类型 | csourcetype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 26 | csourcebillhid | 来源单据表头主键 | csourcebillhid | varchar(20) |  | 主键 (UFID) |
| 27 | csourcebillbid | 来源单据表体主键 | csourcebillbid | varchar(20) |  | 主键 (UFID) |
| 28 | csourcetranstype | 来源交易类型 | csourcetranstype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 29 | vsourcerowno | 来源单据行号 | vsourcerowno | varchar(20) |  | 字符串 (String) |
| 30 | ngrossnum | 毛重 | ngrossnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 31 | crowno | 行号 | crowno | varchar(20) |  | 字符串 (String) |
| 32 | ccorrespondcode | 对应的入库单据号 | ccorrespondcode | varchar(40) |  | 字符串 (String) |
| 33 | ccorrespondbid | 对应入库单表体主键 | ccorrespondbid | varchar(20) |  | 主键 (UFID) |
| 34 | ccorrespondhid | 对应入库单表头主键 | ccorrespondhid | varchar(20) |  | 主键 (UFID) |
| 35 | ccorrespondtranstype | 对应入库单交易类型 | ccorrespondtranstype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 36 | ccorrespondtype | 对应入库单类型 | ccorrespondtype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 37 | ccorrespondrowno | 对应入库单行号 | ccorrespondrowno | varchar(20) |  | 字符串 (String) |
| 38 | pk_batchcode | 批次主键 | pk_batchcode | varchar(20) |  | 批次档案 (BatchcodeVO) |
| 39 | vbarcode | 条形码 | vbarcode | varchar(50) |  | 字符串 (String) |
| 40 | vbarcodesub | 次条码 | vbarcodesub | varchar(50) |  | 字符串 (String) |
| 41 | vboxbarcode | 箱条码 | vboxbarcode | varchar(50) |  | 字符串 (String) |
| 42 | casscustid | 客户属性 | casscustid | varchar(20) |  | 客户基本信息 (customer) |
| 43 | pk_serialcode | 序列号主键 | pk_serialcode | varchar(20) |  | 序列号档案 (SerialNoVO) |
| 44 | cffileid | 特征码 | cffileid | varchar(20) |  | 特征码档案 (bd_ffile) |
| 45 | vfree1 | 自由辅助属性1 | vfree1 | varchar(101) |  | 自由项 (Custom) |
| 46 | vfree2 | 自由辅助属性2 | vfree2 | varchar(101) |  | 自由项 (Custom) |
| 47 | vfree3 | 自由辅助属性3 | vfree3 | varchar(101) |  | 自由项 (Custom) |
| 48 | vfree4 | 自由辅助属性4 | vfree4 | varchar(101) |  | 自由项 (Custom) |
| 49 | vfree5 | 自由辅助属性5 | vfree5 | varchar(101) |  | 自由项 (Custom) |
| 50 | vfree6 | 自由辅助属性6 | vfree6 | varchar(101) |  | 自由项 (Custom) |
| 51 | vfree7 | 自由辅助属性7 | vfree7 | varchar(101) |  | 自由项 (Custom) |
| 52 | vfree8 | 自由辅助属性8 | vfree8 | varchar(101) |  | 自由项 (Custom) |
| 53 | vfree9 | 自由辅助属性9 | vfree9 | varchar(101) |  | 自由项 (Custom) |
| 54 | vfree10 | 自由辅助属性10 | vfree10 | varchar(101) |  | 自由项 (Custom) |