# |<<

**档案对照引入 (fip_docmapimport / nc.vo.fip.docmap.DocmapImportVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2235.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_docmapimport | 对象标识 | pk_docmapimport | char(20) | √ | 主键 (UFID) |
| 2 | docmapcode | 编码 | docmapcode | varchar(40) |  | 字符串 (String) |
| 3 | docmapname | 名称 | docmapname | varchar(200) |  | 多语文本 (MultiLangText) |
| 4 | srctype | 档案转换方式 | srctype | int |  | 档案转换方式 (srctype) |  | 1=档案转换; |