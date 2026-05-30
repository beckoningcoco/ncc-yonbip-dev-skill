# |<<

**销售订单执行情况 (so_execreport / nc.vo.so.m3m.entity.OrderExecRptVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/5406.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | cmaterialid | 物料编码 | cmaterialid | char(20) | √ | 物料基本信息（多版本） (material) |
| 2 | nnum | 主数量 | nnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 3 | cunitid | 主计量单位 | cunitid | varchar(20) |  | 计量单位 (measdoc) |
| 4 | ntotalsendnum | 已发货主数量 | ntotalsendnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 5 | needsendnum | 未发货主数量 | needsendnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 6 | ntotaloutnum | 已出库主数量 | ntotaloutnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 7 | needoutnum | 未出库主数量 | needoutnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 8 | shouldsendnum | 应发主数量 | shouldsendnum | decimal(28, 8) |  | 数值 (UFDouble) |
| 9 | ntotalinvoicenum | 已开票主数量 | ntotalinvoicenum | decimal(28, 8) |  | 数值 (UFDouble) |
| 10 | needinvoicenum | 未开票主数量 | needinvoicenum | decimal(28, 8) |  | 数值 (UFDouble) |
| 11 | totalinvoicemoney | 已开票主金额 | totalinvoicemoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 12 | needinvoicemoney | 未开票主金额 | needinvoicemoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 13 | totalpaymoney | 已付款金额 | totalpaymoney | decimal(28, 8) |  | 数值 (UFDouble) |
| 14 | needpaymoney | 未付款金额 | needpaymoney | decimal(28, 8) |  | 数值 (UFDouble) |