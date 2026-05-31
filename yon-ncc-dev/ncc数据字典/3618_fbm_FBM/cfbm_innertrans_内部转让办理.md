# |<<

**内部转让办理 (cfbm_innertrans / nc.vo.cfbm.innertrans.InnerTransVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1415.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_innertrans | 主键 | pk_innertrans | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | vbillno | 单据编号 | vbillno | varchar(50) |  | 字符串 (String) |
| 4 | pk_org | 资金组织 | pk_org | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 5 | pk_org_v | 资金组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_资金组织版本信息 (fundorg_v) |
| 6 | pk_transtoorg | 受让中心 | pk_transtoorg | varchar(20) |  | 组织_业务单元_资金组织 (fundorg) |
| 7 | pk_transtoorg_v | 受让中心版本 | pk_transtoorg_v | varchar(20) |  | 组织_业务单元_资金组织版本信息 (fundorg_v) |
| 8 | pk_transfromorg | 出让单位 | pk_transfromorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 9 | pk_transfromorg_v | 出让单位版本 | pk_transfromorg_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 10 | pk_inputorg | 录入组织 | pk_inputorg | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 11 | pk_inputorg_v | 录入组织版本 | pk_inputorg_v | varchar(20) |  | 组织_业务单元_财务组织版本信息 (financeorg_v) |
| 12 | pk_inneracc | 内部结算账户 | pk_inneracc | varchar(20) |  | 内部账户 (bd_accid) |
| 13 | pk_innerfbacc | 内部票据账户 | pk_innerfbacc | varchar(20) |  | 内部账户 (bd_accid) |
| 14 | busistatus | 单据状态 | busistatus | int |  | 单据状态 (BillStatusEnum) |  | -1=待审批; |