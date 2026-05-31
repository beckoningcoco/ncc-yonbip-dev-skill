# |<<

**设备类别技术参数 (pam_cate_param / nc.vo.am.category.CateParamVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4236.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_cate_param | 技术参数ID | pk_cate_param | char(20) | √ | 主键 (UFID) |
| 2 | param_index | 参数序号 | param_index | int |  | 整数 (Integer) |
| 3 | classid | 技术参数类型 | classid | varchar(36) |  | 实体 (entity) |
| 4 | show_name | 显示名称 | show_name | varchar(50) |  | 字符串 (String) |
| 5 | input_length | 输入长度 | input_length | int |  | 整数 (Integer) |
| 6 | input_digit | 精度 | input_digit | int |  | 整数 (Integer) |
| 7 | nullflag | 必输 | nullflag | char(1) |  | 布尔类型 (UFBoolean) |