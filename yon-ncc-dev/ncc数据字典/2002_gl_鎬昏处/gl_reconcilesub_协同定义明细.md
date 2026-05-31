# |<<

**协同定义明细 (gl_reconcilesub / nc.vo.gl.reconcile.reconcilesub)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2459.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_reconcilesub | 协同业务子表标识 | pk_reconcilesub | char(20) | √ | 主键 (UFID) |
| 2 | pk_reconcile | 协同业务pk | pk_reconcile | char(20) |  | 主键 (UFID) |
| 3 | serialnumber | 序号 | serialnumber | int |  | 整数 (Integer) |
| 4 | pk_otherprepare | 对方单位制单人 | pk_otherprepare | char(20) |  | 主键 (UFID) |
| 5 | pk_selfglbook | 本方帐簿 | pk_selfglbook | char(20) |  | 主键 (UFID) |
| 6 | pk_selfglorg | 本方主体 | pk_selfglorg | char(20) |  | 主键 (UFID) |
| 7 | pk_otherglbook | 对方帐簿 | pk_otherglbook | char(20) |  | 主键 (UFID) |
| 8 | pk_otherglorg | 对方主体 | pk_otherglorg | char(20) |  | 主键 (UFID) |
| 9 | pk_otherglorgbook | 对方主体帐簿 | pk_otherglorgbook | char(20) |  | 主键 (UFID) |
| 10 | pk_selfglorgbook | 本方主体帐簿 | pk_selfglorgbook | char(20) |  | 主键 (UFID) |
| 11 | issubjdetailrecon | 是否是科目分录协同 | issubjdetailrecon | char(1) |  | 布尔类型 (UFBoolean) |
| 12 | isneedconfirm | 是否需要确认 | isneedconfirm | char(1) |  | 布尔类型 (UFBoolean) |
| 13 | isonlyinnercust | 只协调内部客商 | isonlyinnercust | char(1) |  | 布尔类型 (UFBoolean) |
| 14 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |