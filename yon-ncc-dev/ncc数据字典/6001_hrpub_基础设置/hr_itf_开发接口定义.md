# |<<

**开发接口定义 (hr_itf / nc.vo.hr.devitf.DevItfDefVO)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/2684.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_itf | 开发接口定义表主键 | pk_itf | char(20) | √ | 主键 (UFID) |
| 2 | pk_group | 所属集团 | pk_group | char(20) | √ | 组织_集团 (group) |
| 3 | pk_org | 所属组织 | pk_org | char(20) | √ | 组织 (org) |
| 4 | itf_code | 接口编码 | itf_code | varchar(40) |  | 字符串 (String) |
| 5 | itf_name | 接口名称 | itf_name | varchar(200) |  | 多语文本 (MultiLangText) |
| 6 | disp_seq | 顺序号 | disp_seq | int |  | 整数 (Integer) |
| 7 | modulename | 模块名称 | modulename | varchar(20) |  | 字符串 (String) |
| 8 | itf_level | 参数级别 | itf_level | int |  | 参数级别 (enum) |  | 1=模块级; |