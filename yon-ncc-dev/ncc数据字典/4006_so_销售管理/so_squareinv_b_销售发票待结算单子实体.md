# |<<

**销售发票待结算单子实体 (so_squareinv_b / nc.vo.so.m33.m32.entity.SquareInvBVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5441.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | csalesquarebid | 销售发票结算单子实体 | csalesquarebid | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | pk_org | 结算财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 4 | csquarebillid | 销售发票主实体 | csquarebillid | char(20) |  | 主键 (UFID) |
| 5 | csquarebillbid | 销售发票子实体 | csquarebillbid | char(20) |  | 主键 (UFID) |
| 6 | dbilldate | 销售发票单据日期 | dbilldate | char(19) |  | 日期 (UFDate) |
| 7 | deffectdate | 应收单起效效日期 | deffectdate | char(19) |  | 日期 (UFDate) |
| 8 | vfirstcode | 源头单据号 | vfirstcode | varchar(40) |  | 字符串 (String) |
| 9 | vfirsttrantype | 源头单据交易类型 | vfirsttrantype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 10 | vfirsttype | 源头单据类型 | vfirsttype | varchar(20) |  | 字符串 (String) |
| 11 | cfirstid | 源头单据主表 | cfirstid | varchar(20) |  | 主键 (UFID) |
| 12 | cfirstbid | 源头单据子表 | cfirstbid | varchar(20) |  | 主键 (UFID) |
| 13 | vfirstrowno | 源头单据行号 | vfirstrowno | varchar(20) |  | 字符串 (String) |
| 14 | vsrccode | 来源单据号 | vsrccode | varchar(40) |  | 字符串 (String) |
| 15 | vsrctype | 来源单据类型 | vsrctype | varchar(20) |  | 字符串 (String) |
| 16 | vsrctrantype | 来源单据交易类型 | vsrctrantype | varchar(20) |  | 单据类型 (BilltypeVO) |
| 17 | csrcid | 来源单据主表 | csrcid | varchar(20) |  | 主键 (UFID) |
| 18 | csrcbid | 来源单据子表 | csrcbid | varchar(20) |  | 主键 (UFID) |
| 19 | vsrcrowno | 来源单据行号 | vsrcrowno | varchar(20) |  | 字符串 (String) |
| 20 | vctcode | 合同号 | vctcode | varchar(40) |  | 字符串 (String) |
| 21 | ccustmaterialid | 客户物料码 | ccustmaterialid | varchar(20) |  | 客户物料码 (custmaterial) |
| 22 | cmaterialid | 物料 | cmaterialid | varchar(20) |  | 物料基本信息 (material_v) |
| 23 | cmaterialvid | 物料版本 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 24 | cvendorid | 供应商 | cvendorid | varchar(20) |  | 供应商基本信息 (supplier) |
| 25 | cproductorid | 生产厂商 | cproductorid | varchar(20) |  | 物料生产信息 (materialprod) |
| 26 | cprojectid | 项目 | cprojectid | varchar(20) |  | 项目 (project) |
| 27 | blaborflag | 服务类 | blaborflag | char(1) |  | 布尔类型 (UFBoolean) |
| 28 | bdiscountflag | 折扣类 | bdiscountflag | char(1) |  | 布尔类型 (UFBoolean) |
| 29 | cordercustid | 订单客户 | cordercustid | varchar(20) |  | 客户基本信息 (customer) |
| 30 | cchanneltypeid | 订单渠道类型 | cchanneltypeid | varchar(20) |  | 渠道类型 (channeltype) |
| 31 | cfreecustid | 散户 | cfreecustid | char(20) |  | 主键 (UFID) |
| 32 | blargessflag | 是否赠品 | blargessflag | char(1) |  | 布尔类型 (UFBoolean) |
| 33 | carorgid | 应收组织最新版本 | carorgid | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 34 | carorgvid | 应收组织版本 | carorgvid | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 35 | cprofitcenterid | 利润中心最新版本 | cprofitcenterid | varchar(20) |  | 利润中心 (profitcenter) |
| 36 | cprofitcentervid | 利润中心版本 | cprofitcentervid | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 37 | ccostorgid | 成本域 | ccostorgid | varchar(20) |  | 组织_成本域 (costregion) |
| 38 | csendstockorgid | 库存组织最新版本 | csendstockorgid | varchar(20) |  | 组织_业务单元_库存组织 (stockorg) |
| 39 | csendstockorgvid | 库存组织版本 | csendstockorgvid | varchar(20) |  | 组织_业务单元_库存组织版本信息 (stockorg_v) |
| 40 | csendstordocid | 仓库 | csendstordocid | varchar(20) |  | 仓库 (stordoc) |
| 41 | cdeptid | 销售部门最新版本 | cdeptid | varchar(20) |  | 组织_部门 (dept) |
| 42 | cdeptvid | 销售部门版本 | cdeptvid | varchar(20) |  | 组织_部门版本信息 (dept_v) |
| 43 | csaleorgid | 销售组织最新版本 | csaleorgid | varchar(20) |  | 组织_业务单元_销售组织 (salesorg) |
| 44 | csaleorgvid | 销售组织版本 | csaleorgvid | varchar(20) |  | 组织_业务单元_销售组织版本信息 (salesorg_v) |
| 45 | cemployeeid | 销售业务员 | cemployeeid | varchar(20) |  | 人员基本信息 (psndoc) |
| 46 | pk_batchcode | 批次号档案 | pk_batchcode | char(20) |  | 主键 (UFID) |
| 47 | vbatchcode | 批次号 | vbatchcode | varchar(40) |  | 字符串 (String) |
| 48 | cprolineid | 产品线 | cprolineid | varchar(20) |  | 产品线 (prodline) |
| 49 | vrownote | 行备注 | vrownote | varchar(181) |  | 字符串 (String) |
| 50 | bsquarearfinish | 是否应收结算完成 | bsquarearfinish | char(1) |  | 布尔类型 (UFBoolean) |
| 51 | bsquareiafinish | 是否成本结算完成 | bsquareiafinish | char(1) |  | 布尔类型 (UFBoolean) |
| 52 | bincome | 是否可以收入结算 | bincome | char(1) |  | 布尔类型 (UFBoolean) |
| 53 | bcost | 是否可以成本结算 | bcost | char(1) |  | 布尔类型 (UFBoolean) |
| 54 | fpreartype | 待收入结算类型 | fpreartype | int |  | 结算类型 (SquareType) |  | 0=无; |