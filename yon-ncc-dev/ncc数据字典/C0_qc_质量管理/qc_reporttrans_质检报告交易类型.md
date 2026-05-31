# |<<

**质检报告交易类型 (qc_reporttrans / nc.vo.qc.transtype.entity.ReportTranstypeVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4860.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reporttrans | 质检报告交易类型 | pk_reporttrans | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | vtrantypecode | 交易类型编码 | vtrantypecode | varchar(50) |  | 字符串 (String) |
| 4 | bautoupdateic | 采购、完工检验自动调整库存状态 | bautoupdateic | char(1) |  | 布尔类型 (UFBoolean) |
| 5 | balwayspass | 自动调整库存状态失败时，质检报告审批（或取消审批）通过 | balwayspass | char(1) |  | 布尔类型 (UFBoolean) |
| 6 | ctrantypeid | 交易类型ID | ctrantypeid | varchar(20) |  | 字符串 (String) |