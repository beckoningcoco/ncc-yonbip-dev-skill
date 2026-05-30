# |<<

**合同费用 (ct_ar_exp / nc.vo.ct.ar.entity.CtArExpVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1655.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_ct_ar_exp | 合同费用主键 | pk_ct_ar_exp | char(20) | √ | 主键 (UFID) |
| 2 | vexpcode | 费用编码 | vexpcode | varchar(20) |  | 合同费用定义 (ct_expset) |
| 3 | vexpname | 费用名称 | vexpname | varchar(50) |  | 字符串 (String) |
| 4 | vexpsum | 费用金额 | vexpsum | decimal(20, 8) |  | 数值 (UFDouble) |
| 5 | vmemo | 备注 | vmemo | varchar(181) |  | 字符串 (String) |
| 6 | pk_org | 公司最新版本 | pk_org | varchar(20) |  | 组织_业务单元_公司 (corp) |
| 7 | pk_group | 集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 8 | pk_org_v | 公司 | pk_org_v | varchar(20) |  | 组织_业务单元_公司版本信息 (corp_v) |