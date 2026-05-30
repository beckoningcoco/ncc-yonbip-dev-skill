# |<<

**对方 (gl_vouruleotheracct / nc.vo.gl.vouchkrule.VoucherRuleOtherAcctVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2514.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_vouruleotheracct | 主键 | pk_vouruleotheracct | char(20) | √ | 主键 (UFID) |
| 2 | pk_accasoa | 科目编码 | pk_accasoa | varchar(20) | √ | 会计科目 (accasoa) |
| 3 | assname | 辅助核算 | assname | varchar(2000) |  | 字符串 (String) |
| 4 | assobj | 辅助核算对象 | assobj | image |  | BLOB (BLOB) |