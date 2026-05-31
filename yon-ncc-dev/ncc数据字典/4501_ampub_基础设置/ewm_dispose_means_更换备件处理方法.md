# |<<

**更换备件处理方法 (ewm_dispose_means / nc.vo.am.disposemeans.DisposemeansVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/1924.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_means | 备件处理方法标识 | pk_means | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | varchar(20) |  | 组织_集团 (group) |
| 3 | means_code | 编码 | means_code | varchar(40) |  | 字符串 (String) |
| 4 | means_name | 名称 | means_name | varchar(80) |  | 多语文本 (MultiLangText) |
| 5 | enablestate | 启用状态 | enablestate | int |  | 启用状态 (enablestate) |  | 1=未启用; |