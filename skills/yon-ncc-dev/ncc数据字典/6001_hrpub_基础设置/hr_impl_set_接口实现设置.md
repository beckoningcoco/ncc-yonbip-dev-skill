# |<<

**接口实现设置 (hr_impl_set / nc.vo.hr.devitf.DevItfSetVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2675.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_impl_set | 开发接口实现表主键 | pk_impl_set | char(20) | √ | 主键 (UFID) |
| 2 | pk_itf | 接口定义表主键 | pk_itf | char(20) | √ | 开发接口定义 (devitf_def) |
| 3 | pk_impl | 实现表主键 | pk_impl | char(20) | √ | 开发接口实现 (devitf_impl) |
| 4 | pk_group | 所属集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 5 | pk_org | 组织所属 | pk_org | char(20) | √ | 组织 (org) |
| 6 | itf_code | 接口编码 | itf_code | varchar(40) |  | 字符串 (String) |
| 7 | use_obj | 使用对象主键 | use_obj | varchar(50) |  | 字符串 (String) |