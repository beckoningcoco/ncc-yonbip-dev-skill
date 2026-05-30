# |<<

**责任凭证单分录 (nresa_dutyvoucherentry / nc.vo.nresa.dutyvoucher.DutyVoucherEntryVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/3850.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_voucherentry | 责任凭证分录主键 | pk_voucherentry | char(20) | √ | 主键 (UFID) |
| 2 | entryno | 分录号 | entryno | int |  | 整数 (Integer) |
| 3 | remark | 摘要 | remark | varchar(20) |  | 常用摘要 (summary) |
| 4 | pk_profitcenter | 利润中心 | pk_profitcenter | varchar(20) |  | 利润中心 (profitcenter) |
| 5 | pk_profitcenter_v | 利润中心版本 | pk_profitcenter_v | varchar(20) |  | 利润中心版本 (profitcenterVersion) |
| 6 | pk_fatorasoa | 成本要素 | pk_fatorasoa | varchar(20) |  | 核算要素 (Factor) |
| 7 | pk_account | 会计科目 | pk_account | varchar(20) |  | 会计科目 (accasoa) |
| 8 | pk_factory | 法人公司 | pk_factory | varchar(20) |  | 组织_业务单元_公司 (corp) |
| 9 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 10 | pk_org | 责任组织 | pk_org | varchar(20) |  | 组织_业务单元_责任组织 (liabilitycenter) |
| 11 | pk_org_v | 责任组织版本 | pk_org_v | varchar(20) |  | 组织_业务单元_责任组织版本信息 (liabilitycenter_v) |
| 12 | pk_financial | 财务组织 | pk_financial | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |
| 13 | pk_setofbook | 责任核算账簿类型 | pk_setofbook | varchar(20) |  | 账簿_账簿类型 (setofbook) |
| 14 | pk_dimsgroup | 辅助核算项 | pk_dimsgroup | varchar(20) |  | 会计辅助核算项目 (accassitem) |
| 15 | direction | 方向 | direction | varchar(50) |  | 借贷方向 (DutyVoucherDirection) |  | 0=借; |