# |<<

**技术参数值表 (pam_techvalues / nc.vo.aim.equip.TechValueVo)**

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/4334.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_techvalue | 技术参数值ID | pk_techvalue | char(20) | √ | 主键 (UFID) |
| 2 | tech_index | 技术参数序号 | tech_index | int |  | 整数 (Integer) |
| 3 | tech_classid | 技术参数类型 | tech_classid | varchar(50) |  | 字符串 (String) |
| 4 | tech_value | 技术参数值 | tech_value | varchar(100) |  | 字符串 (String) |
| 5 | tech_showname | 显示名称 | tech_showname | varchar(100) |  | 字符串 (String) |
| 6 | tech_showvalue | 显示值 | tech_showvalue | varchar(100) |  | 字符串 (String) |