# |<<

**销售出库待结算单子实体 (so_squareout_b / nc.vo.so.m33.m4c.entity.SquareOutBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5444.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | csalesquarebid | 销售出库结算单子实体 | csalesquarebid | char(20) | √ | 主键 (UFID) |
| 2 | pk_org | 结算财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 3 | dbilldate | 销售出库单单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 4 | dbizdate | 销售出库单业务日期 | dbizdate | varchar(19) |  | 日期 (UFDate) |
| 5 | deffectdate | 应收单起效日期 | deffectdate | char(19) |  | 日期 (UFDate) |
| 6 | vctcode | 合同号 | vctcode | varchar(40) |  | 字符串 (String) |
| 7 | csquarebillid | 销售出库单主实体 | csquarebillid | char(20) |  | 主键 (UFID) |
| 8 | csquarebillbid | 销售出库单子实体 | csquarebillbid | char(20) |  | 主键 (UFID) |
| 9 | vfirstcode | 源头单据号 | vfirstcode | varchar(40) |  | 字符串 (String) |
| 10 | vfirsttrantype | 源头单据交易类型 | vfirsttrantype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 11 | vfirsttype | 源头单据类型 | vfirsttype | varchar(20) |  | 字符串 (String) |
| 12 | cfirstid | 源头单据主表 | cfirstid | varchar(20) |  | 主键 (UFID) |
| 13 | cfirstbid | 源头单据子表 | cfirstbid | varchar(20) |  | 主键 (UFID) |
| 14 | vfirstrowno | 源头单据行号 | vfirstrowno | varchar(20) |  | 字符串 (String) |
| 15 | vsrccode | 来源单据号 | vsrccode | varchar(40) |  | 字符串 (String) |
| 16 | vsrctype | 来源单据类型 | vsrctype | varchar(20) |  | 字符串 (String) |
| 17 | vsrctrantype | 来源单据交易类型 | vsrctrantype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 18 | csrcid | 来源单据主表 | csrcid | varchar(20) |  | 主键 (UFID) |
| 19 | csrcbid | 来源单据子表 | csrcbid | varchar(20) |  | 主键 (UFID) |
| 20 | vsrcrowno | 来源单据行号 | vsrcrowno | varchar(20) |  | 字符串 (String) |
| 21 | ccustmaterialid | 客户物料码 | ccustmaterialid | varchar(20) |  | 客户物料码 (custmaterial) |
| 22 | cmaterialid | 物料 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 23 | cmaterialvid | 物料版本 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 24 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 25 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 生产厂商(自定义档案) (Defdoc-BD006_0xx) |
| 26 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 27 | cordercustid | 订单客户 | cordercustid | varchar(20) |  | 客户基本信息 (customer) |
| 28 | cinvoicecustid | 订单开票客户 | cinvoicecustid | varchar(20) |  | 客户基本信息 (customer) |
| 29 | cfreecustid | 散户 | cfreecustid | varchar(20) |  | 主键 (UFID) |
| 30 | cpaytermid | 订单收付款协议 | cpaytermid | varchar(20) |  | 收款协议 (income) |
| 31 | cchanneltypeid | 订单渠道类型 | cchanneltypeid | varchar(20) |  | 渠道类型 (channeltype) |
| 32 | blargessflag | 是否赠品 | blargessflag | char(1) |  | 布尔类型 (UFBoolean) |
| 33 | carorgid | 应收组织最新版本 | carorgid | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 34 | carorgvid | 应收组织版本 | carorgvid | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 35 | cprofitcenterid | 结算利润中心最新版本 | cprofitcenterid | varchar(20) |  | 利润中心 (profitcenter) |
| 36 | cprofitcentervid | 结算利润中心版本 | cprofitcentervid | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 37 | ccostorgid | 成本域 | ccostorgid | varchar(20) |  | 组织_成本域 (costregion) |
| 38 | cdeptid | 销售部门最新版本 | cdeptid | varchar(20) |  | 组织_部门 (dept) |
| 39 | cdeptvid | 销售部门版本 | cdeptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 40 | csaleorgid | 销售组织 | csaleorgid | varchar(20) |  | 组织_业务单元_销售组织 (salesorg) |
| 41 | csaleorgvid | 销售组织版本 | csaleorgvid | varchar(20) |  | 组织_业务单元_销售组织版本信息 (salesorg_v) |
| 42 | cemployeeid | 销售业务员 | cemployeeid | varchar(20) |  | 人员基本信息 (psndoc) |
| 43 | pk_batchcode | 批次号档案 | pk_batchcode | varchar(20) |  | 主键 (UFID) |
| 44 | vbatchcode | 批次号 | vbatchcode | varchar(40) |  | 字符串 (String) |
| 45 | cprolineid | 产品线 | cprolineid | varchar(20) |  | 产品线 (prodline) |
| 46 | vrownote | 行备注 | vrownote | varchar(181) |  | 字符串 (String) |
| 47 | bsquarearfinish | 是否应收结算完成 | bsquarearfinish | char(1) |  | 布尔类型 (UFBoolean) |
| 48 | bsquareiafinish | 是否成本结算完成 | bsquareiafinish | char(1) |  | 布尔类型 (UFBoolean) |
| 49 | bincome | 是否可以收入结算 | bincome | char(1) |  | 布尔类型 (UFBoolean) |
| 50 | bcost | 是否可以成本结算 | bcost | char(1) |  | 布尔类型 (UFBoolean) |
| 51 | fpreartype | 待收入结算类型 | fpreartype | int |  | 结算类型 (SquareType) |  | 0=无; |