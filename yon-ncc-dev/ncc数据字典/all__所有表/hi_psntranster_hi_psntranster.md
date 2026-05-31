# |<<

> https://community.yonyou.com/datadict/datadict-2105yiliao/ddc/8684.html

| 序号 | 属性编码 | 属性名称 | 字段编码 | 字段类型 | 是否必输 | 引用模型 | 默认值 | 取值范围/枚举 |
|------|------|------|------|------|------|------|------|------|
| 1 | pk_transfer | pk_transfer | pk_transfer | char(20) | √ |
| 2 | clerkcode | clerkcode | clerkcode | varchar2(20) |
| 3 | code | code | code | varchar2(100) |
| 4 | funcode | funcode | funcode | varchar2(20) |
| 5 | in_date | in_date | in_date | char(19) |
| 6 | in_operater | in_operater | in_operater | varchar2(20) |
| 7 | isfinishpart | isfinishpart | isfinishpart | char(1) |
| 8 | issynwork | issynwork | issynwork | char(1) |
| 9 | memo | memo | memo | varchar2(1024) |
| 10 | name | name | name | varchar2(100) |
| 11 | newpk_dept | newpk_dept | newpk_dept | varchar2(20) |
| 12 | newpk_hrorg | newpk_hrorg | newpk_hrorg | varchar2(20) |
| 13 | newpk_org | newpk_org | newpk_org | varchar2(20) |
| 14 | newpk_psncl | newpk_psncl | newpk_psncl | varchar2(20) |
| 15 | oldpk_dept | oldpk_dept | oldpk_dept | varchar2(20) |
| 16 | oldpk_hrorg | oldpk_hrorg | oldpk_hrorg | varchar2(20) |
| 17 | oldpk_job | oldpk_job | oldpk_job | varchar2(20) |
| 18 | oldpk_org | oldpk_org | oldpk_org | varchar2(20) |
| 19 | oldpk_post | oldpk_post | oldpk_post | varchar2(20) |
| 20 | oldpk_psncl | oldpk_psncl | oldpk_psncl | varchar2(20) |
| 21 | oldpk_psndoc | oldpk_psndoc | oldpk_psndoc | varchar2(20) |
| 22 | oldpk_psnjob | oldpk_psnjob | oldpk_psnjob | varchar2(20) |
| 23 | oldpk_psnorg | oldpk_psnorg | oldpk_psnorg | varchar2(20) |
| 24 | out_date | out_date | out_date | char(19) |
| 25 | out_operater | out_operater | out_operater | varchar2(20) |
| 26 | pk_businesstype | pk_businesstype | pk_businesstype | varchar2(20) |
| 27 | pk_group | pk_group | pk_group | varchar2(20) |
| 28 | pk_org | pk_org | pk_org | varchar2(20) |
| 29 | refusereason | refusereason | refusereason | varchar2(100) |
| 30 | transfer_date | transfer_date | transfer_date | char(10) |
| 31 | transfer_reason | transfer_reason | transfer_reason | varchar2(20) |
| 32 | transfer_state | transfer_state | transfer_state | number(38, 0) |
| 33 | dr | dr | dr | number(10, 0) |  |  | 0 |
| 34 | ts | ts | ts | char(19) |  |  | to_char(sysdate,'yyyy-mm-dd hh24:mi:ss') |