# |<<

**例外科目 (gl_expaccount / nc.vo.voucher.fip.Expaccount)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2416.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_expaccount | 主键 | pk_expaccount | char(20) | √ | 主键 (UFID) |
| 2 | pk_accasoa | 科目 | pk_accasoa | varchar(20) |  | 会计科目 (accasoa) |
| 3 | name | 名称 | name | varchar(50) |  | 字符串 (String) |
| 4 | code | 编码 | code | varchar(50) |  | 字符串 (String) |