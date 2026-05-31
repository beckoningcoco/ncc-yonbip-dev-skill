# |<<

**标志行设置 (hr_ifsettop / nc.vo.hr.datainterface.IfsettopVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2673.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_hr_ifsettop | 首末行设置表主键 | pk_hr_ifsettop | char(20) | √ | 主键 (UFID) |
| 2 | ifid | 数据接口ID | ifid | char(20) |  | 主键 (UFID) |
| 3 | iseq | 序号 | iseq | int |  | 整数 (Integer) |
| 4 | vcontent | 项目 | vcontent | varchar(50) |  | 字符串 (String) |
| 5 | vfieldname | 字段名称 | vfieldname | varchar(100) |  | 字符串 (String) |
| 6 | ifldwidth | 项目宽度 | ifldwidth | int |  | 整数 (Integer) |  | [0 , ] |
| 7 | iflddecimal | 小数位数 | iflddecimal | int |  | 整数 (Integer) |  | [0 , ] |
| 8 | vseparator | 项目分割符 | vseparator | varchar(50) |  | 项目分割符 (ItemSeprtorEnum) |  | 0=逗号; |