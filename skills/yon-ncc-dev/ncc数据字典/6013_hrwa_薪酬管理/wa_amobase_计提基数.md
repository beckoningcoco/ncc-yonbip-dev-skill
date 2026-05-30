# |<<

**计提基数 (wa_amobase / nc.vo.wa.amoscheme.AmobaseVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/6316.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_amobase | 计提基数主键 | pk_amobase | char(20) | √ | 主键 (UFID) |
| 2 | pk_amoscheme | 分摊方案主键 | pk_amoscheme | char(20) |  | 主键 (UFID) |
| 3 | iplusminus | 加减标志 | iplusminus | int |  | 整数 (Integer) |
| 4 | pk_wa_item | 薪资项目主键 | pk_wa_item | varchar(50) | √ | 字符串 (String) |
| 5 | showorder | 显示顺序 | showorder | int |  | 整数 (Integer) |