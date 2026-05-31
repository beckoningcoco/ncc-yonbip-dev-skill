# |<<

**销售毛利预估 (so_profit / nc.vo.so.pub.entry.ProfitVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5427.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cstockorgid | 库存组织 | cstockorgid | varchar(20) | √ | 组织_业务单元_库存组织 (stockorg) |
| 2 | cstordocid | 仓库 | cstordocid | varchar(20) |  | 仓库 (stordoc) |
| 3 | cmaterialid | 物料 | cmaterialid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 4 | nastnum | 主数量 | nastnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 5 | vbatchcode | 批次 | vbatchcode | varchar(40) |  | 字符串 (String) |
| 6 | ntotalincome | 销售收入 | ntotalincome | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | ntotalcost | 成本 | ntotalcost | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | ntotalprofit | 毛利 | ntotalprofit | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | corigcurrencyid | 币种 | corigcurrencyid | varchar(20) |  | 币种 (currtype) |
| 10 | castunitid | 主单位 | castunitid | varchar(20) |  | 计量单位 (measdoc) |
| 11 | pk_org | 主组织 | pk_org | varchar(50) |  | 字符串 (String) |
| 12 | cfinanceorg | 财务组织 | cfinanceorg | varchar(50) |  | 字符串 (String) |
| 13 | cmaterialvid | 物料编码 | cmaterialvid | varchar(20) |  | 物料基本信息（多版本） (material) |
| 14 | blargessflag | 赠品 | blargessflag | char(1) |  | 布尔类型 (UFBoolean) |
| 15 | bdiscountflag | 折扣 | bdiscountflag | char(1) |  | 布尔类型 (UFBoolean) |
| 16 | blaborflag | 服务 | blaborflag | char(1) |  | 布尔类型 (UFBoolean) |