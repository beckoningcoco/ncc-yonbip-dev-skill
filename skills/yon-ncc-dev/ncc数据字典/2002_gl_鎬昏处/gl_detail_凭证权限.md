# |<<

**凭证权限 (gl_detail / nc.vo.gl.aggvoucher.DetailPermVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2403.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_detail | 分录主键 | pk_detail | char(20) | √ | 字符串 (String) |
| 2 | pk_accasoa | 会计科目 | pk_accasoa | varchar(20) |  | 会计科目 (accasoa) |
| 3 | pk_currtype | 币种 | pk_currtype | varchar(20) |  | 币种 (currtype) |
| 4 | pk_accountingbook | 核算账簿 | pk_accountingbook | varchar(20) |  | 账簿_财务核算账簿 (accountingbook) |
| 5 | pk_vouchertype | 凭证类别 | pk_vouchertype | varchar(20) |  | 凭证类别 (vouchertype) |
| 6 | pk_org | 财务组织 | pk_org | varchar(20) |  | 组织_业务单元_财务组织 (financeorg) |