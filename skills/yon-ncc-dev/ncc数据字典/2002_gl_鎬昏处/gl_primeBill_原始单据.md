# |<<

**原始单据 (gl_primeBill / nc.vo.gl.primeBill.primeBill)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2443.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_primebill | 原始单据主键 | pk_primebill | char(20) | √ | 主键 (UFID) |
| 2 | pk_parentbill | 父单据主键 | pk_parentbill | char(20) |  | 主键 (UFID) |
| 3 | parenttablename | 父单据表名称 | parenttablename | varchar(50) |  | 字符串 (String) |
| 4 | name | 原始单据名称 | name | varchar(200) |  | 字符串 (String) |
| 5 | content | 原始单据内容 | content | image |  | 图片类型 (IMAGE) |
| 6 | memassage | 原始单据说明 | memassage | varchar(1000) |  | 字符串 (String) |
| 7 | pk_group | 所属集团 | pk_group | char(20) |  | 主键 (UFID) |